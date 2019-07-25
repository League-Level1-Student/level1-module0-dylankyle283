package _08_jack_in_the_box;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Jack_in_the_box implements ActionListener {
		   public void showButton() {
		     System.out.println("Button clicked");
		    JFrame frame = new JFrame();
		    JButton button = new JButton();
		    frame.add(button);
		    frame.pack();
		    button.addActionListener(this);
		 button.setText("Suprise");
		   }

	
		public void actionPerformed(ActionEvent e) {
			
			
		}
		}

