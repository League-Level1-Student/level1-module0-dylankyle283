package _03_photo_quiz;
/*
 *    Copyright (c) The League of Amazing Programmers 2013-2019
 *    Level 1
 */

import java.awt.Component;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class PhotoQuiz {

	public void run() throws Exception {

		JFrame quizWindow = new JFrame();
		quizWindow.setVisible(true);
		// This will make sure the program exits when you close the window
		quizWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// 1. find an image on the internet, and put its URL in a String
		// variable (from your browser, right click on the image, and select
		// “Copy Image Address”)
String url = "https://th.bing.com/th/id/OIP.1KoAVC4vl-6d5HD7BhLSdwHaFj?w=227&h=180&c=7&r=0&o=5&dpr=2&pid=1.7";
String url2 ="https://th.bing.com/th/id/OIP.sOe1OMtk8Mcq6sOSiyxrDQHaE8?pid=ImgDet&rs=1";
// 2. create a variable of type "Component" that will hold your image
Component compo;
Component image2;
		// 3. use the "createImage()" method below to initialize your Component
compo = createImage(url);
		// 4. add the image to the quiz window
quizWindow.add(compo);
		// 5. call the pack() method on the quiz window
quizWindow.pack();
		// 6. ask a question that relates to the image
String answer = JOptionPane.showInputDialog("is the time after 2pm?");
		// 7. print "CORRECT" if the user gave the right answer
if(answer.equals("yes")) {
	System.out.println("correct!");
}
		// 8. print "INCORRECT" if the answer is wrong
else{
	System.out.println("incorrect!");
}
		// 9. remove the component from the quiz window (you may not see the
		// effect of this until step 12)
quizWindow.remove(compo);
		// 10. find another image and create it (might take more than one line
		// of code)
image2 = createImage(url2);
		// 11. add the second image to the quiz window
quizWindow.add(image2);
		// 12. pack the quiz window
quizWindow.pack();
		// 13. ask another question
String answer2 = JOptionPane.showInputDialog("How many horses are on the farm?");
		// 14+ check answer, say if correct or incorrect, etc.
if(answer2.contentEquals("2")) {
	System.out.println("correct!");
	
}

else {
	System.out.println("incorrect");
}
	}

	private Component createImage(String imageUrl) throws MalformedURLException {
		URL url = new URL(imageUrl);
		Icon icon = new ImageIcon(url);
		JLabel imageLabel = new JLabel(icon);
		return imageLabel;
	}

	/* OPTIONAL */
	// *14. add scoring to your quiz
	// *15. make something happen when mouse enters image
	// (imageComponent.addMouseMotionListener())
}
