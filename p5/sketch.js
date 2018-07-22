class Cuadrado {
  constructor(x, y, w, h) {
    this.x = x;
    this.y = y;
    this.w = w;
    this.h = h;
  }
  show() {
      rect(this.x, this.y, this.w, this.h);
  }
  move () {
    this.x += Math.round(Math.random()) * 2 - 1;
    this.y += Math.round(Math.random()) * 2 - 1;
  }
}
let cuadrados = new Array();

function mouseClicked() {
  let cuadrado = new Cuadrado(300,300, 40, 40);
  cuadrados.push(cuadrado);
  console.log('Mouse clicked!!');
  console.log(cuadrados.lenght);
}


function setup() {
  createCanvas(600, 600);
}
function draw() {
  background(200);
  for (let i = 0; i < cuadrados.lenght; i++) {
    cuadrados[i].show();
    cuadrados[i].move();
  }


}
