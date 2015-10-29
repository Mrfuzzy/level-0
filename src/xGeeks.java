// Copyright Wintriss Technical Schools 2014
import javax.swing.JOptionPane;

import org.w3c.dom.css.ElementCSSInlineStyle;

/*
 * Everyone has a superpower. Mine is writing recipes. This program will store
 * the superpowers of all the people in the classroom. E.g. When I type "June",
 * your program should say "June's superpower is writing recipies".
 */
public class xGeeks {
public static void main(String[] args) {

		// 1. Save the superpower for each person in a variable.
	for (int i = 0; i < 4; i++) {
		String power = JOptionPane.showInputDialog(null,"whos power do you wana know");
		
			
		if (power.equalsIgnoreCase("Gerry"))
		{
			JOptionPane.showMessageDialog(null, "Gerry is a fast typer and a standerd geek");
		}
		else if (power.equalsIgnoreCase("nancy")) {
			JOptionPane.showMessageDialog(null, "Nancy is very good at socializing");
		}
		else if (power.equalsIgnoreCase("noelani")) {
			JOptionPane.showMessageDialog(null, "noelani is good at adapting");
		}
		else {
			JOptionPane.showMessageDialog(null, power + " is awesome");
		}
		// 2. Ask the user to enter a name. Store their answer in a variable.

		// 3. Show the superpower in a pop-up, depending on the name entered. 

	}
}
}