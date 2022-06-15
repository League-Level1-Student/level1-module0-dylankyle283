package _09_sound_effects_machine;

import java.applet.AudioClip;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


	public class SoundEffectsMachine_ implements ActionListener {
		 JButton button;
		    JButton button2;
		    JButton button3;
		   public void showButton() {
		   JFrame frame = new JFrame();
		   button = new JButton();
		   button2 = new JButton();
		   button3 = new JButton();
		    JPanel panel = new JPanel();
		    frame.add(panel);
		   panel.add(button);
		   panel.add(button2);
		  panel.add(button3);
		   frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		  frame.setVisible(true);
		button.setText("wood");
		  button2.setText("water");
		  button3.setText("bird");
		   button.addActionListener(this);
		   button2.addActionListener(this);
		   button3.addActionListener(this);
		   panel.setVisible(true);
		  
		   frame.pack();
		   }

		
		public void actionPerformed(ActionEvent e ) {
		
			if (e.getSource().equals(button)) {
				playSound("sawing-wood-daniel_simon.wav");
				System.out.println("wood");
			}
			else if (e.getSource().equals(button2)) {
				playSound("421184__inspectorj__water-pouring-a (1).wav");
			}
			else {
				playSound("456440__inspectorj__bird-whistling-robin-single-13.wav");
			}
		
		
		}
		private void playSound(String fileName) {
		     AudioClip sound = JApplet.newAudioClip(getClass().getResource(fileName)); 
		     sound.play();
		}

	}

	//
	//

	