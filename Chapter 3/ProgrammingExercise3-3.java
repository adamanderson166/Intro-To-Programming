import java.util.Scanner;

class LinearEquationSolution {
	public static void main(String[] args) {
				Scanner input = new Scanner(System.in);

				System.out.println("Enter a: ");
				double a = input.nextDouble();
				System.out.println("Enter b: ");
				double b = input.nextDouble();
				System.out.println("Enter c: ");
				double c = input.nextDouble();
				System.out.println("Enter d: ");
				double d = input.nextDouble();
				System.out.println("Enter e: ");
				double e = input.nextDouble();
				System.out.println("Enter f: ");
				double f = input.nextDouble();
				double x = ((e * d) - (b * f)) / ((a * d) - (b * c));
				double y = ((a * f) - (e * c)) / ((a * d) - (b * c));
				double solutionChecker = (a * d) - (b * c);
					
				if (solutionChecker == 0) {
					System.out.println("The equation has no solution.");
				}

				System.out.println("a = " + a);
				System.out.println("b = " + b);
				System.out.println("c = " + c);
				System.out.println("d = " + d);
				System.out.println("e = " + e);
				System.out.println("f = " + f);
				System.out.println("x = " + x);
				System.out.println("y = " + y);
				
				input.close();

	}
}