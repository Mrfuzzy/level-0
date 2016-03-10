import java.net.URI;

import javax.swing.JOptionPane;

public class CrazyCatLady {
	public static void main(String[] args) {
		// 1. Ask the user how many cats they have
		String answer = JOptionPane.showInputDialog("How may cats do you have");
		// 2. Convert their answer into an int
		int num = Integer.parseInt(answer);
		// 3. If they have more than 3 cats, tell them they're a crazy cat lady
		if (num>3 || num==3) {
			JOptionPane.showMessageDialog(null, "Your a crazy cat lady/dude");
		}
		// 4. If they have 3 or less, call the method below to show them a cat video
		if (num<3) {
			playVideo("https://www.youtube.com/watch?v=ZIQiiG6i09A");
		}
		// 5. If they say 0, show them a video of A Frog Sitting on a Bench Like a Human
		
	}

	static void playVideo(String videoURL) {
		try {
			URI uri = new URI(videoURL);
			java.awt.Desktop.getDesktop().browse(uri);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
