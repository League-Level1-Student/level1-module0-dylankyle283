package _08_jack_in_the_box;

import java.applet.AudioClip;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.print.DocFlavor.URL;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Jack_in_the_box implements ActionListener {
		   public void showButton() {
		   
		    JFrame frame = new JFrame();
		    frame.setSize(500,500);
		    JButton button = new JButton();
		    frame.add(button);
		    frame.pack();
		    button.addActionListener(this);
		 button.setText("Suprise");
		frame.setVisible(true);
		   }

		   int counter = 0;
		public void actionPerformed(ActionEvent e) {
	
		counter ++;
	

			if (counter == 5) {
				showPicture("jackInTheBox.png");
				createLabelImage("jackInTheBox.png");
				playSound("homer-woohoo.wav");
			}
	System.out.println(counter);
		}
		private void showPicture(String fileName) { 
		     try {
		          JLabel imageLabel = createLabelImage(fileName);
		          JFrame frame = new JFrame();
		          frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		          frame.add(imageLabel);
		          frame.setVisible(true);
		          frame.pack();
		     } catch (Exception e) {
		          e.printStackTrace();
		     }
		}

		private JLabel createLabelImage(String fileName) {
		     try {
		          java.net.URL imageURL = getClass().getResource(fileName);
		          if (imageURL == null) {
		               System.err.println("Could not find image " + fileName);
		               return new JLabel();
		          } else {
		               Icon icon = new ImageIcon(imageURL);
		               JLabel imageLabel = new JLabel(icon);
		               return imageLabel;
		          }
		     } catch (Exception e) {
		          System.err.println("Could not find image " + fileName);
		          return new JLabel();
		     }
		}
		private void playSound(String soundFile) { 
		     try {
		          AudioClip sound = JApplet.newAudioClip(getClass().getResource(soundFile));
		          sound.play();
		     } catch (Exception e) {
		          e.printStackTrace();
		     }
		}
		}



