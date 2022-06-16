float x =  random(600);
float y =  random(600);





void setup(){
  
  size(600,600);
  background(0,0,0);
  
  
  
}



void draw(){
 // background(0,0,0);
 
  makeMagical();
  
  
  for(int i = 0; i<600; i++){
     x =  getWormX(i);
     y =  getWormY(i);
     ellipse(x,y,3,3); 
     fill(frameCount, i, 0);
       
    
}
  
  
  
}



 float frequency = .001;
    float noiseInterval = PI;

    void makeMagical() {
        fill( 0, 0, 0, 10 );
        rect(0, 0, width, height);
        noStroke();
    }

    float getWormX(int i) {
        return map(noise(i*noiseInterval + frameCount * frequency), 0, 1, 0, width);
    }

    float getWormY(int i) {
        return map(noise(i*noiseInterval+1 + frameCount * frequency), 0, 1, 0, height);
    }
