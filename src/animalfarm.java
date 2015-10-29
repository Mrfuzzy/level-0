import java.io.File;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JOptionPane;

public class animalfarm {

	animalfarm() {
		/*
		 * 1. Ask the user which animal they want, then play the sound of that
		 * animal.
		 * 
		 */
		for (int i = 0; i < 5; i++) {

			String animal = JOptionPane.showInputDialog("what animal sound do dyou wana me to play (options are:cow,duck,dog and llama)");
			if (animal.equalsIgnoreCase("cow")) { 
				playMoo();
			} else if (animal.equalsIgnoreCase("duck")) {
				playQuack();
			} else if (animal.equalsIgnoreCase("dog")) {
				playWoof();
			} 
			else if (animal.equalsIgnoreCase("llama")) {
				playLlama();
			}
			else {
				JOptionPane.showMessageDialog(null, "sorry, i dont know that animal's sound :(");
			}
		}

		/* 2. Make it so that the user can keep entering new animals. */
	}

	void playMoo() {
		playNoise(mooFile);
	}

	void playQuack() {
		playNoise(quackFile);
	}

	void playWoof() {
		playNoise(woofFile);
	}
	void playLlama(){
		playNoise(llamaFile);
	}

	String quackFile = "/Users/workshop/Google Drive/league-sounds/quack.wav";
	String mooFile = "/Users/workshop/Google Drive/league-sounds/moo.wav";
	String woofFile = "/Users/workshop/Google Drive/league-sounds/woof.wav";
	String meowFile = "/Users/workshop/Google Drive/league-sounds/meow.wav";
	String llamaFile = "/Users/workshop/Google Drive/league-sounds/llama.wav";

	/* Ignore this stuff */

	public void playNoise(String soundFile) {
		try {
			AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File(soundFile));
			Clip clip = AudioSystem.getClip();
			clip.open(audioInputStream);
			clip.start();
			Thread.sleep(3400);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	public static void main(String[] args) {
		new animalfarm();
	}

}
