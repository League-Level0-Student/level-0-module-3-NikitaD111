
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

import java.awt.Color;
import java.util.Random;

public class RobotColorChooser {
	public static void main(String[] args) {
		Robot r = new Robot();

		// 3. ask the user what color they would like the robot to draw
		String a = JOptionPane.showInputDialog("what color do you want to make the robot. Blue, Red, Green");
		// 4. use an if/else statement to set the pen color that the user requested
		r.setSpeed(100);
		r.setPenWidth(100);
		r.hide();
		for (int i = 0; i < 10000; i++) {
		Random b = new Random();
		int bg = b.nextInt(255);
		Random g = new Random();
		int bv = b.nextInt(255);
		Random v = new Random();
		int ba = b.nextInt(255);
		if (a.equals("Blue")) {
				r.setPenColor(17, 172, 247);
				r.penDown();
				r.move(15);
				r.turn(5);

			}
			if (a.equals("Green")) {
				r.setPenColor(81, 250, 10);
				r.penDown();
				r.move(15);
				r.turn(5);

			}
			if (a.equals("Red")) {
				r.setPenColor(240, 0, 0);
				r.penDown();
				r.move(15);
				r.turn(5);
			} else {
				r.setPenColor(bg, bv, ba);
				r.penDown();
				r.move(15);
				r.turn(5);
			}
		}
	}
}
// 5. if the user doesn’t enter anything, choose a random color

// 6. put a loop around your code so that you keep asking the user for more
// colors & drawing them

// 2. set the pen width to 10

// 1. make the robot draw a shape (this will take more than one line of code)
