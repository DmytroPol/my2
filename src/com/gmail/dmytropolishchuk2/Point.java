package com.gmail.dmytropolishchuk2;

public class Point {
	private double x;
	private double y;

	public Point(double x, double y) {
		super();
		this.x = x;
		this.y = y;

	}

	public Point() {
		super();
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	public static double getDist(Point a, Point b) {
		return Math.sqrt(Math.pow(a.x - b.x, 2) + (Math.pow(a.y - b.y, 2)));
	}

	@Override
	public String toString() {
		return "[" + "x= " + x + ", y= " + y + "]";
	}
}

// def distance_from_other_point(self, other_point):
// return math.sqrt( ( other_point.getX() - self.getX() )**2 + (
// other_point.getY() - self.getY() )**2 )
// Distance =math.sqrt((x2-x1)^2+(y2-y1)^2);