import javax.swing.JOptionPane;

public class itsyourbday {
	public static void main(String[] args) {
		String answer = JOptionPane.showInputDialog("when is your b-day");
		if (answer.equals("10/14")) {
			JOptionPane.showMessageDialog(null, "Happy Birthay");
		} else {
			JOptionPane.showMessageDialog(null, "Happy unbirthay");
		}
	}
}
