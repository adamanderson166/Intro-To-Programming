public class Triangle extends GeometricObject {
	private double side1;
	private double side2;
	private double side3;
	
	public Triangle(){
		
	}
	
	public Triangle(double side1, double side2, double side3) {
			this.side1 = side1;
			this.side2 = side2;
			this.side3 = side3;
		}

		public double getside1() {
			return side1;
		}
		
		public double getside2() {
			return side2;
		}
		
		public double getside3() {
			return side3;
		}
		
		@Override
		public double getArea() {
			return (Math.sqrt((side1 + side2 + side3) / 2));
		}
		
		@Override
		public double getPerimeter() {
			return (side1 + side2 + side3);
		}
		
		public String toString() {
			return ("Triangle: side1 = " + side1 + " side 2 = " + side2 + " side 3 = " + side3);
		}
}