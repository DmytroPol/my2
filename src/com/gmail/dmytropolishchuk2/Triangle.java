package com.gmail.dmytropolishchuk2;

public class Triangle extends Shape {
	private Point a;
	private Point b;
	private Point c;

	public Triangle(Point a, Point b, Point c) {
		this.a = a;
		this.b = b;
		this.c = c;

	}

	public Triangle() {
		super();

	}

	public Point getA() {
		return a;
	}

	public void setA(Point a) {
		this.a = a;
	}

	public Point getB() {
		return b;
	}

	public void setB(Point b) {
		this.b = b;
	}

	public Point getC() {
		return c;
	}

	public void setC(Point c) {
		this.c = c;
	}

	@Override
	public double calculatePerimetr() {

		return Point.getDist(a, b) + Point.getDist(b, c) + Point.getDist(c, a);
	}

	@Override
	public double calculateArea() {
		double polP = this.calculatePerimetr() / 2;
		return Math.sqrt(
				polP * (polP - Point.getDist(a, b)) * (polP - Point.getDist(b, c)) * (polP - Point.getDist(c, a)));
	}

	@Override
	public String toString() {
		return "Triangle: [" + "a=" + a + ", b=" + b + ", c=" + c + "]";
	}
}
