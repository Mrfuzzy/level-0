import org.jointheleague.graphical.robot.Robot;

public class Star {
public static void main(String[] args) {
	Robot bob = new Robot("mini");
	bob.penDown();
	for (int i = 0; i < 5; i++) {
	bob.turn(145);
	bob.move(100);
	}
	bob.hide();
}
}
