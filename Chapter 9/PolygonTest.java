class RegularPolygonTest {
	public static void main(String[] args) {
		
		RegularPolygon polygon1 = new RegularPolygon();
		RegularPolygon polygon2 = new RegularPolygon(6, 4);
		RegularPolygon polygon3 = new RegularPolygon(10, 4, 5.6, 7.8);
		
		System.out.println("The area of polygon2 is " + polygon2.getArea());
		System.out.println("The perimeter of polygon2 is " + polygon2.getPerimeter());
		System.out.println("The area of polygon3 is " + polygon3.getArea());
		System.out.println("The perimeter of polygon3 is " + polygon3.getPerimeter());
	
	}

}