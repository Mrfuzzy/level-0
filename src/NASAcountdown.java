import javax.swing.JOptionPane;

public class NASAcountdown {
	public static void main(String[] args) {
		// 2. ask the user when to start (JOptionPane.showInputDialog)
		String answer = JOptionPane.showInputDialog("what number do you want me to count down from");
		// 3. convert the user's answer to an int (Integer.parseInt)
			int num = Integer.parseInt(answer);
		// 4. countdown from user's starting point
		// 1. countdown from 10 to 0
		for(int i = num; i > 0; i--){
			speak(""+i);
		}
		speak("blastoff");
		// 5. when the counting is done, print "blastoff!"
	}

static void speak(String words) {
   	 try {
   		 Runtime.getRuntime().exec("say " + words).waitFor();
   	 } catch (Exception e) {
   		 e.printStackTrace();
   	 }
  }
}


