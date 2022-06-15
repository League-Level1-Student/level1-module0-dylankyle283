package _10_cuteness_tv;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URI;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class tv implements ActionListener {
	JButton button;
	JButton button2;
	JButton button3;

	// public class TV{
	public void showButton() {
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();

		button = new JButton("Duck");
		button2 = new JButton("Frog");
		button3 = new JButton("Horse");
		frame.add(panel);
		panel.add(button);
		panel.add(button2);
		panel.add(button3);
		frame.setVisible(true);
		panel.setVisible(true);
		frame.pack();
		button.addActionListener(this);
		button2.addActionListener(this);
		button3.addActionListener(this);
	}
	// }

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == button) {
			showDucks();
			System.out.println("duck clicked");
		} else if (e.getSource() ==button2) {
			showFrog();
		} else if (e.getSource() == button3) {
			showHorse();
		}

	}

	void showDucks() {
		playVideo("https://www.youtube.com/watch?v=MtN1YnoL46Q");
	}

	void showFrog() {
		playVideo("https://www.youtube.com/watch?v=cBkWhkAZ9ds");
	}

	void showHorse() {
		playVideo("https://www.youtube.com/watch?v=a-xWhG4UU_Y");
	}

	void playVideo(String videoID) {

		// Workaround for Linux because "Desktop.getDesktop().browse()" doesn't
		// work on some Linux implementations
		try {
			if (System.getProperty("os.name").toLowerCase().contains("linux")) {
				if (Runtime.getRuntime().exec(new String[] { "which", "xdg- open" }).getInputStream().read() != -1) {
					Runtime.getRuntime().exec(new String[] { "xdg-open", videoID });
				}
			} else {
				URI uri = new URI(videoID);
				java.awt.Desktop.getDesktop().browse(uri);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
