package com.gmail.dmytropolishchuk2;

public class Circle extends Shape {
	private Point a;
	private Point o;

	public Circle(Point o, Point a) {
		super();
		this.a = a;
		this.o = o;
	}

	public Circle() {
		super();
	}

	public Point getA() {
		return a;
	}

	public void setA(Point a) {
		this.a = a;
	}

	public Point getO() {
		return o;
	}

	public void setO(Point o) {
		this.o = o;
	}

	@Override
	public double calculatePerimetr() {

		return 2 * Math.PI * Point.getDist(o, a);
	}

	@Override
	public double calculateArea() {
		return Math.PI * Math.pow(Point.getDist(o, a), 2);
	}

	@Override
	public String toString() {
		return "Circle: [" + "o=" + o + ", a=" + a + "]";
	}
}