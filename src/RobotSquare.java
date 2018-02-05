
/*
 *    Copyright (c) The League of Amazing Programmers 2013-2017
 *    Level 0
 */

import org.jointheleague.graphical.robot.Robot;

// This recipe draws a square using the Robot

public class RobotSquare {
	public static void main(String[] args) throws Exception {

		// 1. Make a new Robot
		Robot robot = new Robot();
		robot.setPenWidth(200);
		// 3. Put the robot's pen down
		robot.penDown();

		// 6. Make the robot move as fast as possible
		robot.setSpeed(10000);

		// 5. Do everything below here 4 times

		// 2. Move your robot 200 pixels
		for (int i = 0; i < 360; i++) {
			robot.move(4);
			robot.turn(1);
		}
		// 4. Turn the robot 90 degrees to the right (90 degrees)

	}
}
