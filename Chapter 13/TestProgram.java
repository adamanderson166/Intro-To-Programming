public class TestProgram {
	public static void main(String[] args) {
		GeometricObject07[] objects = {new Square(2.5), new Square(3.0), new Square(4.0), new Square(5.9), new Square(2.2)};
		for (int i = 0; i < objects.length; i++) {
			if (objects[i] instanceof Colorable) {
				((Colorable)objects[i]).howToColor();
			}
		}
	}
}
interface Colorable {
	
	public void howToColor();	
}

class Square extends GeometricObject07 implements Colorable {
	double sidelength = 0.0;
	
	public Square(double sidelength) {
	this.sidelength = sidelength;
	}
	@Override
	public void howToColor() {
		System.out.println("Color all four sides ");
	}
	
	@Override
		public double getPerimeter() {
		return sidelength * 4;
	}
	
	@Override
		public double getArea() {
		return (sidelength * sidelength);
		}
}