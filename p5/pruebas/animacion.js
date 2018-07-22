const w = 600; // ancho
const h = 600; // largo
const fps = 60;

class Circulo {
  constructor(x, y, w = 40, h = 40) {
    this.x = x;
    this.y = y;
    this.w = w;
    this.h = h;
  }
  show(xInicial = 0, yInicial = 0) {
      if (this.traza) {
        console.log('Dibujar traza!');
        line(xInicial, yInicial, this.x, this.y);
      }
      ellipse(this.x, this.y, this.w, this.h);
  }
  move() {
    console.log('Muevete!');
  }
}

let miCirculo = new Circulo(w/2, h/2);

function setup() {
  createCanvas(w, h);
  frameRate(fps);
  background(200);


}

function mouseClicked() {
  miCirculo.traza = true;
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
      } else {
        miCirculo.x = miCirculo.x - 1;
      }
      // line(xInicial, yInicial, miCirculo.x, miCirculo.y);
    }
    while (miCirculo.y != yFinal) {
      if (miCirculo.y < yFinal) {
        miCirculo.y = miCirculo.y + 1;
      } else {
        miCirculo.y = miCirculo.y - 1;
      }
    }
  return miCirculo.show(xInicial, yInicial);
}

function draw() {
  // background(200);
  // line(miCirculo.x, miCirculo.y, 0, 0);
  // miCirculo.show();
  if(miCirculo.traza) {
    animacion();
    miCirculo.traza = false;
  } else {
    miCirculo.show();
  }
  stroke(0); // bordes negros
  fill(255); // rellenar de blanco
}
