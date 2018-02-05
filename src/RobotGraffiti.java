import org.jointheleague.graphical.robot.Robot;

public class RobotGraffiti {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Robot robot = new Robot();
		robot.setSpeed(1000000);
		robot.setPenWidth(200);
		robot.setRandomPenColor();
		robot.penDown();
		robot.move(150);
		robot.penUp();
		robot.turn(90);
		robot.move(100);
		robot.penDown();
		robot.turn(140);
		robot.move(120);
		robot.turn(-90);
		robot.move(100);
		robot.penUp();
		robot.turn(270);
		robot.move(100);
		robot.penDown();
		for (int i = 0; i < 360; i++) {
			robot.move(1);
			robot.turn(1);
		}
	}

}
