class TestOctagon {
	public static void main(String[] args) {
		
		Octagon octagon1 = new Octagon(8);
		System.out.println(octagon1);
		
	}
}



class Octagon extends GeometricObject implements Comparable<Octagon>, Cloneable {
	private int side;
	
	public Octagon() {
			side = 1;
		}
	
	public Octagon(int side) {
		this.side = side;	
	}

	@Override
	public double getArea() {
		return (side * side * (2 + (4 / Math.sqrt(2))));
	}
	
	@Override
	public double getPerimeter() {
		return (this.side * 8);
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException {
		try {
			
			
			return super.clone();
		}
		catch (CloneNotSupportedException ex) {
			return null;
		}
	}
	
	@Override
	public int compareTo(Octagon o) {
		if (getArea() > o.getArea()) {
			return 1;
		}
		else if (getArea() < o.getArea()) {
			return -1;
		}
		else {
			return 0;
		}
	}
	
}