import javax.swing.JOptionPane;

public class RiddleMeThis {

	public static void main(String[] args) {

		// 1. Make a variable to hold the score
		int score = 0;
		// 3. Ask the user a riddle. Here are some ideas: bit.ly/the-riddler
			String answer =JOptionPane.showInputDialog("what gets wet when drying?");
		
			if (answer.equalsIgnoreCase("a towel")) {
				JOptionPane.showMessageDialog(null, "Correct!!");
				score = score + 1;
			}
	
			else {
				JOptionPane.showMessageDialog(null, "Your dumb");
			}
		// 6. Add some more riddles
			String answer1 =JOptionPane.showInputDialog("?");
			
			if (answer1.equalsIgnoreCase("a towel")) {
				JOptionPane.showMessageDialog(null, "Correct!!");
				score = score + 1;
			}
	
			else {
				JOptionPane.showMessageDialog(null, "Your dumb");
			}
		// 2. Make a pop up to show the score.
		JOptionPane.showMessageDialog(null, "score " + score);
	}
}

