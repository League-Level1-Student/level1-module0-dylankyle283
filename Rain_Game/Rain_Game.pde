int rainY = 0;
int randomNumber = (int) random(600);
int score = 0;
void setup(){
  
  size(600,600);
  
  
  
}
void draw(){
   background(0, 200, 100);
  
   fill(0, 60, 200);
    stroke(0, 60, 200);
    ellipse(randomNumber, rainY, 25, 37);
 rect(mouseX, 570, 50, 30);
rainY +=5;
if(rainY == 600){
rainY = 0;
 randomNumber = (int) random(600);
checkCatch(randomNumber);
 

}
fill(0, 0, 0);
    textSize(16);
    text("Score: " + score, 20, 20);
}

 void checkCatch(int x){
         if (x > mouseX && x < mouseX+100)
            score++;
         else if (score > 0) 
            score--;
     //   println("Your score is now: " + score);
    }
