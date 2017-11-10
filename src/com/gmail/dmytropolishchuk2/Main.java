package com.gmail.dmytropolishchuk2;

public class Main {

	public static void main(String[] args) {
		Shape triangle = new Triangle(new Point(0, 0), new Point(0, 4), new Point(3, 0));
		System.out.println(triangle);
		System.out.println(triangle.calculatePerimetr());
		System.out.println(triangle.calculateArea());
		Shape circle = new Circle(new Point(0, 0), new Point(8, 6));
		System.out.println(circle);
		System.out.println(circle.calculatePerimetr());
		System.out.println(circle.calculateArea());
		Shape quadrangle = new Quadrangle(new Point(0, 0), new Point(0, 5), new Point(5, 0), new Point(5, 5));
		System.out.println(quadrangle);
		System.out.println(quadrangle.calculatePerimetr());
		System.out.println(quadrangle.calculateArea());
	}

}
