public abstract class Square07 extends GeometricObject07 implements Colorable {
	private double width;
	private double height;
	
	public Square07() {
	}
	
	public Square07(double width, double height) {
		this.width = width;
		this.height = height;
	}
	
	public Square07(double width, double height, String color, boolean filled) {
		this.width = width;
		this.height = height;
		setColor(color);
		setFilled(filled);
	}
	
	/** Return width */
	public double getWidth() {
		return width;
	}
	
	/** Set a new width */
	public void setWidth(double width) {
		this.width = width;
	}
	
	/** Return height */
	public double getHeight() {
		return height;
	}
	
	/** Set a new height */
	public void setHeight(double height) {
		this.height = height;
	}
	
	/** Return area */
	public double getArea() {
		return width * height;
	}
	
	/** Return perimeter */
	public double returnPerimeter() {
		return 2 * (width + height);
	}
}