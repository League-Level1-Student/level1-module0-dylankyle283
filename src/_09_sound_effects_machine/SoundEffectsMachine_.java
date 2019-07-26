package _09_sound_effects_machine;

import java.applet.AudioClip;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


	public class SoundEffectsMachine_ implements ActionListener {
		   public void showButton() {
		   JFrame frame = new JFrame();
		    JButton button = new JButton();
		    JButton button2 = new JButton();
		    JButton button3 = new JButton();
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
		playSound("sawing-wood-daniel_simon.wav");
			
		}
		private void playSound(String fileName) {
		     AudioClip sound = JApplet.newAudioClip(getClass().getResource(fileName)); 
		     sound.play();
		}

	}

	

