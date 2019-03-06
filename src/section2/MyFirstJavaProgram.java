package section2;

import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {
	
	public static void main(String[] args) {
		
		// START HERE
		Robot Wally = new Robot();
	Wally.penDown();
	Wally.setSpeed(100);
	for(int i=0;i<4;i++) {
	Wally.move(100);
	Wally.turn(90);
	}
	
	
		
		
	}
}
