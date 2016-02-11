
import java.io.IOException;

import javax.swing.JOptionPane;

public class Steven {

    // 1. make a main method and put steps 2, 3 & 4 inside it
	public static void main(String[] args) {
		

    // 2. ask the user for a sentence
		for (int i = 0; i < 20; i++) {
			
		String sen = JOptionPane.showInputDialog("Give me a sentence");
    // 3. call the speak method below and send it the sentence
    // 4. repeat steps 2 and 3 a lot of times
				speak(sen);
		}
	}
/* Don’t change this…. */
static void speak(String words) {
   	 try {
   		 Runtime.getRuntime().exec("say " + words).waitFor();
   	 } catch (Exception e) {
   		 e.printStackTrace();
   	 }
    }

}

// Copyright Wintriss Technical Schools 2014




