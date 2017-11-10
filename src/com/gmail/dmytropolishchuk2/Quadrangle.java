package com.gmail.dmytropolishchuk2;

public class Quadrangle extends Shape {
	private Point a;
	private Point b;
	private Point c;
	private Point d;

	public Quadrangle(Point a, Point b, Point c, Point d) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
	}

	public Quadrangle() {
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

	public Point getD() {
		return d;
	}

	public void setD(Point d) {
		this.d = d;
	}

	@Override
	public double calculatePerimetr() {

		return Point.getDist(a, b) + Point.getDist(b, c) + Point.getDist(c, d) + Point.getDist(a, d);
	}

	@Override
	public double calculateArea() {
		double p = this.calculatePerimetr() / 2;
		return Math.sqrt((p - Point.getDist(a, b)) * (p - Point.getDist(b, c)) * (p - Point.getDist(c, d))
				* (p - Point.getDist(a, d)));
	}

	@Override
	public String toString() {
		return "Quadrangle: [" + "a=" + a + ", b=" + b + ", c=" + c + ", d=" + d + "]";
	}
}
