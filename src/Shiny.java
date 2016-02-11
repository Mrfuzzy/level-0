import java.io.File;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JOptionPane;

public class Shiny {

	public static void main(String[] args) {

		// 2. Ask the user how many shiny objects they want
		String num0 =JOptionPane.showInputDialog("how many shiny things do you want");
		// 3. Play the sound that many times
		int num1 = Integer.parseInt(num0);
		// 1. Call the method below
for (int i = 0; i < num1; i++) {
	
		playMisterZee();
}

	}

	public static void playMisterZee() {
    	try {
   		 File soundFile = new File("/Users/League/Google Drive/league-sounds/shiny-objects.wav");
   		 AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(soundFile);
   		 Clip clip = AudioSystem.getClip();
   		 clip.open(audioInputStream);
   		 clip.start();
   		 Thread.sleep(3400);
    	} catch (Exception ex) {
        	ex.printStackTrace();
    	}
	}

}

