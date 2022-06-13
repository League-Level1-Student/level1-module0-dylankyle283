package _01_houses;

import java.awt.Color;
import java.lang.reflect.Method;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class houses {
public static void main(String[] args) {
	
	
	
	
	
	
drawHouse();
}	
	    
	
	
 static void drawHouse(){
		Robot rob = new Robot("mini");
		
		
		rob.setX(50);
		rob.setY(500);
		rob.setSpeed(100);

	 for (int i = 0; i < 10; i++) {
					
		 
		 String househeight = JOptionPane.showInputDialog("how tall do you want the houses");
			
			int height = 0;
			System.out.println(househeight);
			if (househeight.equals("small") ) {
				height = 60;
				System.out.println(height);
			}
			
			if (househeight.equals("medium")) {
				height = 120;
			}
			
			if (househeight.equals("large")) {
				height = 250;
			}
		 
		 
		 
			String red = JOptionPane.showInputDialog("color?");
			String green = JOptionPane.showInputDialog("color?");
			String blue = JOptionPane.showInputDialog("color?");
			
			int redVal = Integer.parseInt(red);
			int greenVal = Integer.parseInt(green);
			int blueVal = Integer.parseInt(blue);
			
			rob.setPenColor(redVal,greenVal,blueVal);
			
		 	rob.penDown();
			
			
			rob.move(height);
			
			if(height < 250) {
				rob.turn(45);
				rob.move(40);
				rob.turn(90);
				rob.move(40);
				rob.setAngle(90);
			}
			
			if(height >=250) {
				rob.turn(90);
				rob.move(30);
			}
			
			rob.turn(90);
			rob.move(height);
	
			rob.setPenColor(0, 100, 10);
			rob.turn(270);
		rob.move(50);
			rob.turn(270);
			 
			rob.setPenColor(0, 0, 0);
			}
 
	
	
}






}
