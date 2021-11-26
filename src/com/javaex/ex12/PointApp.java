package com.javaex.ex12;

public class PointApp {

	public static void main(String[] args) {

		Point p = new Point(4,4);
		ColorPoint cp1 = new ColorPoint("red");
		ColorPoint cp2 = new ColorPoint(10,10,"blue");
		System.out.println("p-----");
		p.showInfo();
		System.out.println("cp1------");
		cp1.showInfo();
		System.out.println("cp2------");
		cp2.showInfo();
	}

}
