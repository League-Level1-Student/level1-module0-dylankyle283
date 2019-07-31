PImage backgroundImage;
int paddleX = mouseX;
int paddleY = 450;
int ballX = 300;
int ballY = 150;
int paddleLength = 100;
 


void setup(){
  
size(600, 600);


 backgroundImage = loadImage("pong.png"); 
  println(mouseX);
}
void draw(){

 

  if(ballX == 0){
  ballX += 10;
  }
else if(ballX == width){
  ballX -= 10;
}
if(ballY == height){
  ballY += 10;
}
if(ballY == 600){
  ballY -= 10;

}


image(backgroundImage, 0, 0);
image(backgroundImage, 0, 0, width, height); 
 fill(255, 255, 255);
stroke(255, 255, 255);
ellipse(ballX, ballY, 50, 50);
ballY += 10;
rect(mouseX, paddleY, paddleLength, 50);
if(intersects(ballX,ballY,paddleX,paddleY, paddleLength) == true){
  ballY -= 20;
}


}
boolean intersects(int ballX, int ballY, int paddleX, int paddleY, int paddleLength) {
     if (ballY > paddleY && ballX > paddleX && ballX < paddleX + paddleLength)
          return true;
     else 
          return false;
}
