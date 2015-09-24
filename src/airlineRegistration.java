// Copyright Wintriss Technical Schools 2013
import javax.swing.JOptionPane;

/**
 * Airline registration 
 * 
 * You are writing a program for a new airline to take their registration information at the check-in counter
 * and print their boarding pass. You need to collect the following information: 
 * 		First name 
 * 		Last name
 * 		Destination airport 
 * 		Birthday (for security purposes) 
 * 		Male/female (for security purposes) 
 * 
 * Print the boarding pass in this format:
 * LAST NAME / FIRST NAME (BIRTHDAY, M/F) 
 * Traveling to: DESTINATION
 * 
 * Toolbox: main() method, JOptionPane.showInputDialog, variables
 * 
 **/
public class airlineRegistration {
	public static void main(String[] args) {
		String firstname = JOptionPane.showInputDialog("whats your first name");
		String lastname = JOptionPane.showInputDialog("whats your last name");
		String airport = JOptionPane.showInputDialog("whats your destination");
		String birthay = JOptionPane.showInputDialog("whats your birtday");
		String gender = JOptionPane.showInputDialog("whats your gender");
		JOptionPane.showMessageDialog(null, lastname + " / " + firstname + "(" + birthay + "), " + gender + "\n" + "traveling to:" + airport);
		
		
	}
}


