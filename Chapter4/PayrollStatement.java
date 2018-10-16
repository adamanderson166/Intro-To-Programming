/*
Author: Adam Anderson
Date: 10/16/2018
This program prompts the user to enter information and prints out a payroll statement
*/

import java.util.Scanner;

class PayrollStatement {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter employee's name: ");
		String employeeName = input.next();
		System.out.print("Enter number of hours worked: ");
		double hoursWorked = input.nextDouble();
		System.out.print("Enter hourly pay rate: ");
		double payRate = input.nextDouble();
		System.out.print("Enter federal tax witholding rate: ");
		double fedWitholdingRate = input.nextDouble();
		System.out.print("Enter state tax witholding rate: ");
		double stateWitholdingRate = input.nextDouble();
		double grossPay = (hoursWorked * payRate);
		double stateWitholding = ((grossPay * stateWitholdingRate));
		double fedWitholding = ((grossPay * fedWitholdingRate));
		double totalDeduction = (fedWitholding + stateWitholding);
		
		System.out.println("Employee Name: " + employeeName);
		System.out.println("Hours Worked: " + hoursWorked);
		System.out.println("Pay Rate: " + payRate);
		System.out.println("Gross Pay: " + (payRate * hoursWorked));
		System.out.println("Deductions: ");
		System.out.println("        Federal Witholding" + "(" + (fedWitholdingRate * 100) + "%):" + "$" + (grossPay * fedWitholdingRate));
		System.out.println("        State Witholding" + "(" + (stateWitholdingRate * 100) + "%):" + "$" + (grossPay * stateWitholdingRate));	
		System.out.println("        Total Deduction:" + (stateWitholding + fedWitholding));
		
		System.out.println("Net Pay: " + (grossPay - totalDeduction));
		input.close();
	}
}