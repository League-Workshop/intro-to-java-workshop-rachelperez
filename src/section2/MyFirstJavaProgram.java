package section2;

import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {
	
	public static void main(String[] args) {
		
		// START HERE
	Robot   BB8=new  Robot();
	BB8.changeRobot("https://i.ytimg.com/vi/CyH09RLM9Dk/maxresdefault.jpg");
		BB8.penDown();
		BB8.setRandomPenColor();
		int sides=17;
		int angle=360/sides;	
	for(int i=0;i<sides;i++) {
		BB8.move(100);
		BB8.turn(angle);
	}
	
	
	
	}
}
