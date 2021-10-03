package _01_Olympic_Rings;

import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;

public class OlympicRings_Threaded {
	// Make A Program that uses Threads and robots to draw the Olympic rings. One
	// robot should draw one ring simultaneously with the other 4 robots.
	static Robot timmy = new Robot(650, 700);
	static Robot tammy = new Robot(800, 700);
	static Robot sammy = new Robot(950, 700);
	static Robot x = new Robot(725, 755);
	static Robot y = new Robot(875, 755);

	public static void main(String[] args) {
		setup();

		Thread r1 = new Thread(() -> circle(timmy));
		Thread r2 = new Thread(() -> circle(tammy));
		Thread r3 = new Thread(() -> circle(sammy));
		Thread r4 = new Thread(() -> circle(x));
		Thread r5 = new Thread(() -> circle(y));

		r1.start();
		r2.start();
		r3.start();
		r4.start();
		r5.start();
		

	}

	public static void circle(Robot selected) {
		for (int i = 0; i < 36; i++) {
			selected.move(10);
			selected.turn(10);
		}
		selected.penUp();
	}

	public static void setup() {
		timmy.hide();
		tammy.hide();
		sammy.hide();
		x.hide();
		y.hide();
		timmy.penDown();
		timmy.setPenColor(Color.BLUE);
		tammy.penDown();
		tammy.setPenColor(Color.BLACK);
		sammy.penDown();
		sammy.setPenColor(Color.RED);
		x.penDown();
		x.setPenColor(Color.ORANGE);
		y.penDown();
		y.setPenColor(Color.GREEN);
		penWidth();
		setSpeed();
	}
	public static void penWidth() {
		timmy.setPenWidth(5);
		tammy.setPenWidth(5);
		sammy.setPenWidth(5);
		x.setPenWidth(5);
		y.setPenWidth(5);
	}
	public static void setSpeed() {
		timmy.setSpeed(4);
		tammy.setSpeed(4);
		sammy.setSpeed(4);
		x.setSpeed(5);
		y.setSpeed(5);
	}
}