const w = 600; // ancho
const h = 600; // largo

class Circulo {
  constructor(x, y, w = 40, h = 40) {
    this.x = x;
    this.y = y;
    this.w = w;
    this.h = h;
  }
  show() {
      ellipse(this.x, this.y, this.w, this.h);
  }
  move() {
    console.log('Muevete!');
    let xFinal = mouseX;
    let yFinal = mouseY;

    while (this.x != xFinal) {
      if (this.x < xFinal) {
        this.x = this.x++;
      } else {
        this.x = this.x--;
      }
      ellipse(this.x, this.y, this.w, this.h);
    }
    while (this.y != yFinal) {
      if (this.y < yFinal) {
        this.y = this.y++;
      } else {
        this.y = this.y--;
      }
      ellipse(this.x, this.y, this.w, this.h);
    }
  }
}

let miCirculo = new Circulo(w/2, h/2);

function setup() {
  createCanvas(w, h);
}

function mousePressed() {
  miCirculo.move();
}

function draw() {
  background(200);
  miCirculo.show();
}
