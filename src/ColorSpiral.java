import org.jointheleague.graphical.robot.Robot;

public class ColorSpiral {

	public static void main(String[] args) {

		Robot cp = new Robot();
		// 5. Set your robot's pen to the down position
		cp.penDown();
		cp.setSpeed(10);
		for (int i = 0; i < 75; i++) {
			cp.setRandomPenColor();
			cp.move(3*i);
			cp.turn(360/7);
			cp.setPenWidth(i);
			cp.hide();
		}
	}
}
