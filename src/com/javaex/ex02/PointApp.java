package com.javaex.ex02;

public class PointApp {

	public static void main(String[] args) {
		Point dot1 = new Point(3,6);
//		dot1.setX(5);
//		dot1.setY(5);
		dot1.draw();
		
		Point dot2 = new Point(10,23);
//		dot2.setX(10);
//		dot2.setY(23);
		dot2.draw();
		
		Point dot3 = new Point(55,65);
		dot3.draw(true);
		dot3.draw(false);
	}

}
