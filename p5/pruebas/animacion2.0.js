const w = 600; // ancho
const h = 600; // largo
const fps = 60;

class Circulo {
  constructor(x, y, w = 40, h = 40) {
    this.x = x;
    this.y = y;
    this.w = w;
    this.h = h;
    this.history = [];
  }
  show() {
    for (let i = 0; i < this.history.length; i++) {
      let posicion = this.history[i];
      stroke(0); // bordes negros
      fill(255); // rellenar de blanco
      ellipse(posicion.x,posicion.y,this.w, this.h);
    }
    stroke(0); // bordes negros
    fill(255); // rellenar de blanco
    ellipse(this.x, this.y, this.w, this.h);

  }
  update() {
    let vector = createVector(this.x, this.y)
    if (this.history.length == 500) {
      this.history.splice(0,1);
    }
    this.history.push(vector);
    console.log(vector);
  }
  animacion() {
    let xFinal = mouseX;
    let yFinal = mouseY;
    let xInicial = this.x;
    let yInicial = this.y;

    while (this.x != xFinal) {
      if (this.x < xFinal) {
        console.log('Mi x:' + this.x + '\txFinal:' + xFinal);
        this.x = this.x + 1;
        this.update();
      } else {
        this.x = this.x - 1;
        this.update();
      }
    }
    while (this.y != yFinal) {
      if (this.y < yFinal) {
        this.y = this.y + 1;
        this.update();
      } else {
        this.y = this.y - 1;
        this.update();
      }
    }
  }
}

let miCirculo = new Circulo(w/2, h/2);

function setup() {
  createCanvas(w, h);
  frameRate(fps);
}

function mouseClicked() {
  animacion();
  miCirculo.show();
}

function animacion() {
    let xFinal = mouseX;
    let yFinal = mouseY;
    let xInicial = miCirculo.x;
    let yInicial = miCirculo.y;

    while (miCirculo.x != xFinal) {
      if (miCirculo.x < xFinal) {
        console.log('Mi x:' + miCirculo.x + '\txFinal:' + xFinal);
        miCirculo.x = miCirculo.x + 1;
        miCirculo.update();
      } else {
        miCirculo.x = miCirculo.x - 1;
        miCirculo.update();
      }
      // line(xInicial, yInicial, miCirculo.x, miCirculo.y);
    }
    while (miCirculo.y != yFinal) {
      if (miCirculo.y < yFinal) {
        miCirculo.y = miCirculo.y + 1;
        miCirculo.update();
      } else {
        miCirculo.y = miCirculo.y - 1;
        miCirculo.update();
      }
    }
  return miCirculo.show();
}

function draw() {
  background(200);
  miCirculo.show();
}
