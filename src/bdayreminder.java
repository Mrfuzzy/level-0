 // Copyright Wintriss Technical Schools 2013
import javax.swing.JOptionPane;

public class bdayreminder {

	public static void main(String[] args) {
	
		// 1. correct the birthdays for your family below
		String momsBirthday = "April 16th";
		String dadsBirthday = "March 10th";
		String myBirthday = "January 23rd";

		// 2. Find out which birthday the user wants and and store their response in a variable
	String answer = JOptionPane.showInputDialog("Whos b-day do you wana know");
		// 3. Print out what the user typed
		System.out.println(answer);
		// 4. if user asked for "mom"
			//print mom's birthday
		if (answer.equalsIgnoreCase("mom")) {
			JOptionPane.showMessageDialog(null, momsBirthday);
		}
		// 5. if user asked for "dad"
			// print dad's birthday
		else if (answer.equalsIgnoreCase("dad")) {
			JOptionPane.showMessageDialog(null, dadsBirthday);
		}
		// 6. if user asked for your name
		else if (answer.equals("me")) {
			JOptionPane.showMessageDialog(null, myBirthday);
		}
		else {
			JOptionPane.showMessageDialog(null, "Sorry, i dont known that person's birthday");
		}
			// print myBirthday
		//7. otherwise print "Sorry, i don't remember that person's birthday!"

	} 
}
