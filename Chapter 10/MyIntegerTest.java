/*
Author: Adam Anderson
Date: 1/31/2018
This program prints out the area of a rectangle using a class object.
*/

class MyIntegerTest {
	public static void main(String[] args) {
		
		MyInteger checker = new MyInteger(10);
		
		
		System.out.println("getvalue: " + checker.getValue());
		
		System.out.println("isEven: " + checker.isEven());
		System.out.println("isOdd: " + checker.isOdd());
		System.out.println("isPrime: " + checker.isPrime());
		
		System.out.println("isEven: " + checker.isEven(10));
		System.out.println("isOdd: " + checker.isOdd(10));
		System.out.println("isPrime: " + checker.isPrime(10));
		
		System.out.println("isEven: " + checker.isEven(checker));
		System.out.println("isOdd: " + checker.isOdd(checker));
		System.out.println("isPrime: " + checker.isPrime(checker));
		
		System.out.println("equals1: " + checker.equals1(10));
		System.out.println("equals2: " + checker.equals2(checker));
		
		System.out.println("parseInt: " + checker.parseInt("10"));
		System.out.println("parseInt: " + checker.parseInt("10"));	
		}
	
	
}