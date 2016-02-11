import javax.swing.JOptionPane;

public class com {
	public static void main(String[] args) {
		String name = JOptionPane.showInputDialog("give your name");
		if (name.equalsIgnoreCase("june")) {
			speak("you are a good teacher june");
		}
		else if (name.equalsIgnoreCase("meg")) {
			speak("you are a good teacher meg");
		}
		else if (name.equalsIgnoreCase("jerry")) {
			speak("you are verry intelligent jerry");
		}
		else if (name.equalsIgnoreCase("roberto")) {
			speak("you are very mexican roberto");
		}
		else if (name.equalsIgnoreCase("nancy")) {
			speak("you are beast at soccer nancy");
		}
		else if (name.equalsIgnoreCase("khia")) {
			speak("you are nice khia");
		}
		else if (name.equalsIgnoreCase("noelani")) {
			speak("you are funny noelani");
		}
	}
	static void speak(String words) {
	   	 try {
	   		 Runtime.getRuntime().exec("say " + words).waitFor();
	   	 } catch (Exception e) {
	   		 e.printStackTrace();
	   	 }
	    }

}













































 