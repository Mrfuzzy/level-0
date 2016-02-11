import javax.swing.JOptionPane;

import org.teachingextensions.logo.Tortoise;

public class Dizzy {

	public static void main(String[] args) {
		
		  //1. Use the dance method to make the Tortoise spin.
		String num0 =JOptionPane.showInputDialog("how many times do you want the turtle to spin from 1 to 10");
		int num1 = Integer.parseInt(num0);
		  dance(num1);
		 // 2. Ask the user how dizzy you want the tortoise from 1-10, then spin
		  //t/hat number of times.
		 ///

	}

	static void dance(int numberOfSpins) {
		for (int i = 0; i < numberOfSpins; i++) {
			Tortoise.turn(360);
		}
	}
}
