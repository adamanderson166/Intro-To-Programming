public class RegularPolygon {
	
	private int numberOfSides;
	private double sideLength;
	private double xCenter;
	private double yCenter;
	
	public RegularPolygon() {
		numberOfSides = 3;
		sideLength = 1;
		xCenter = 0;
		yCenter = 0;
	}
	
	public RegularPolygon(int numberOfSides, double sideLength) {
		this.sideLength = sideLength;
		this.numberOfSides = numberOfSides;
	}
	
	public RegularPolygon(int numberOfSides, double sideLength, double xCenter, double yCenter) {
		this.sideLength = sideLength;
		this.numberOfSides = numberOfSides;
		this.xCenter = xCenter;
		this.yCenter = yCenter;
	}
	
	public int getNumberOfSides() {
		return numberOfSides;
	}
	
	public void setNumberofSides(int numberOfSides) {
		numberOfSides = numberOfSides;
	}
	
	public double getSideLength() {
		return sideLength;
	}
	
	public void setSideLength(int sideLength) {
		sideLength = sideLength;
	}
	
	public double getXCenter() {
		return xCenter;
	}
	
	public void setXCenter() {
		xCenter = xCenter;
	}
	
	public double getYCenter() {
		return yCenter;
	}
	
	public void setYCenter() {
		yCenter = yCenter;
	}
	
	public double getPerimeter() {
		return numberOfSides * sideLength;
	}
	
	public double getArea() {
		return (numberOfSides * (sideLength * sideLength)) / 4 * Math.tan(Math.PI / numberOfSides);
	}
}