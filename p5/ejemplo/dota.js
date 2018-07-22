let img;

function preload() {
  img = loadImage('dotamap.jpg');
}

function setup() {
  img.loadPixels();
}

function draw() {
  backgroung(WHITE);
  image(img, 0, 0);
}
