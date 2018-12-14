public class AddMatrix { 
	public static void main(String[] args) {
		double[][] a = {{1.0,2.0,3.0}, {4.0,5.0,6.0}, {7.0,8.0,9.0}};
		double[][] b = {{0.0,2.0,4.0}, {1.0,4.5,2.2}, {1.1,4.3,5.2}};
		double[][] arrayC = new double [3][3];		
		arrayC = addMatrix(a, b);
		for (int i = 0; i < arrayC.length; i++) {
			System.out.println();
			for (int x = 0; x < arrayC[i].length; x++) {
				System.out.print(arrayC[i][x] + " ");
			}
		}
	}
	public static double[][] addMatrix(double[][] a, double[][] b) {
		double[][] resultMatrix = new double [3][3];	
		for(int i = 0; i < a.length; i++) {
			for(int j = 0; j < a[0].length; j++) {
				resultMatrix[i][j] = a[i][j] + b[i][j];
			}
		}
		return resultMatrix;	
	}		
}	