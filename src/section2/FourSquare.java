package section2;

import javax.swing.JOptionPane;
import org.jointheleague.graphical.robot.Robot;

public class FourSquare {

	Robot Wally = new Robot();
	
	void go() {
		Wally.penDown();
		// 4. Make the robot move as fast as possible
		Wally.setSpeed(1000);
		// 5. Set the pen width to 5
		Wally.setPenWidth(5);
		// 6. Use a for loop to repeat steps #7 to #8, four times...
		for (int i = 0; i < 4; i++) {
			Wally.setRandomPenColor();
		
		// 7. Set the pen color to random

		// 1. Call the drawSquare() method
		drawSquare();
		// 8. Turn the robot 90 degrees to the right
		Wally.turn(90);
		}
	}

	void drawSquare() {
		JOptionPane.showMessageDialog(null, "yay! you called the drawSquare() method!");
		/* 3. Fill in the code to draw a square inside the method below. */
		for (int i = 0; i < 4; i++) {
			Wally.move(100);
			Wally.turn(90);
		}
	}

	public static void main(String[] args) {
		new FourSquare().go();
	}

}
