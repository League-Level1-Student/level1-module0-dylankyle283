package _01_houses;

import java.lang.reflect.Method;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class houses {
public static void main(String[] args) {
	
	
	
	
	
	String househeight = JOptionPane.showInputDialog("how tall do you want the houses");
	int height = Integer.parseInt(househeight);
drawHouse();
}	
	    
	
	
 static void drawHouse(){
		Robot rob = new Robot("mini");
		
		rob.setX(50);
		rob.setY(500);
		rob.setSpeed(100);

	 for (int i = 0; i < 10; i++) {
					rob.penDown();
			rob.move(100);
			rob.turn(90);
			rob.move(30);
			rob.turn(90);
			rob.move(100);
		rob.setPenColor(0, 100, 10);
			rob.turn(270);
		rob.move(50);
			rob.turn(270);
			rob.setPenColor(0, 0, 0);
			}
 
	
	
}






}
