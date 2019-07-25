package _07_fortune_cookie;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Fortune_cookie implements ActionListener {	
	int rand = new Random().nextInt(5);
	public void showButton() {
		    JFrame frame = new JFrame();
	frame.setVisible(true);
	JButton button = new JButton();
	frame.add(button);
	frame.pack();
	button.addActionListener(this);
	button.setText("Click for your fortune");
	
	
	
	
	
	
	
	
	
	}


	public void actionPerformed(ActionEvent e) {
		
		
	if (rand == 0) {
		JOptionPane.showMessageDialog(null, "you will win the lottery today");
	}
	if (rand == 1) {
		JOptionPane.showMessageDialog(null, "terrible misfortune awaits");
	}
	if (rand == 2) {
		JOptionPane.showMessageDialog(null, "you will save someones life some day");
	}
	if (rand == 3) {
		JOptionPane.showMessageDialog(null, "you will become a master at coding");
	}
	if (rand == 4) {
		JOptionPane.showMessageDialog(null, "you will have a great summer");
	}
rand = new Random().nextInt(5);
}
		}

