
// Copyright Wintriss Technical Schools 2013
import javax.swing.JOptionPane;
import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;
import org.teachingextensions.logo.Colors;
import org.teachingextensions.logo.Tortoise;

public class robotcolorchooser {
	public static void main(String[] args) {
		Robot bob = new Robot();
		bob.changeRobot("/Users/workshop/Documents/level-0/src/second.robi");
		// 3. ask the user what color they would like the tortoise to draw
		for (int i = 0; i < 5; i++) {
		String color = JOptionPane.showInputDialog("What color would you like the robot to draw");
		// 4. use an if/else statement to set the pen color that the user
		// requested
		
			
		
		if (color.equalsIgnoreCase("red")) {
			bob.setPenColor(Color.red);
		} else if (color.equalsIgnoreCase("blue")) {
			bob.setPenColor(Color.blue);
		} else if (color.equalsIgnoreCase("green")) {
			bob.setPenColor(Color.green);
		}
		// 5. if the user doesn’t enter anything, choose a random color
		else {
			bob.setRandomPenColor();
		}
		// 6. put a loop around your code so that you keep asking the user for
		// more colors & drawing them

		// 2. set the pen width to 10

		// 1. make the tortoise draw a shape (this will take more than one line
		// of code)

		bob.setSpeed(10);
		bob.penDown();
		bob.setPenWidth(10);
		for (int j = 0; j < 5; j++) {
			bob.move(50);
			bob.turn(360 / 4);
		}
		}
	}
}
