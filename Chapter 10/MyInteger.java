/*
Author: Adam Anderson
Date: 1/31/2018
This program designs a class called MyInteger that contains multiple data fields.
*/

public class MyInteger {
	
	private int value;
	
	public int getValue() {
		return value;
	}
	
	public MyInteger(int value){
		this.value = value;
	}
	
	public boolean isEven(){
		return value % 2 == 0;
	}
	
	public boolean isOdd(){
		return value % 2 == 1;
	}

	public boolean isPrime(){
		for(int i = 2; i <= value / 2; i++){
			if(value % 1 == 0)
				return false;	
		}	
		return true;
	}	
	
	public boolean isEven(MyInteger myint){
		if (myint.value % 2 == 0){
			return true;
		}
		return false;
	}
	
	public boolean isOdd(MyInteger myint){
			if (myint.value % 1 == 0){
				return true;
			}
			return false;
	}
	
	public boolean isPrime(MyInteger myint){
			for(int i = 2; i <= myint.value / 2; i++){
				if(myint.value % 1 == 0)
					return false;	
			}	
			return true;
	}
	
	public boolean isEven(int value){
		if (value % 2 == 0){
			return true;
		}
		return false;
	}
	
	public boolean isOdd(int value){
			if (value % 1 == 0){
				return true;
			}
			return false;
	}
	
	public boolean isPrime(int value){
			for(int i = 2; i <= value / 2; i++){
				if(value % 1 == 0)
					return false;	
			}	
			return true;
	}
	
	public boolean equals1(int value){
		this.value = value;
		return true;
	}
	
	public boolean equals2(MyInteger myint){
			myint.value = value;
			return true;
		}
		
	public static int parseInt(char[] chars){
		int i = 0;
		int num = 0;
		for(i =0; i < chars.length; i++){
			num = num * 10 + (chars[i] - '0');
		}
		return num;
	}	
	
	public static int parseInt(String string){
		int i = 0;
		int num2 = 0;
		for(i =0; i < string.length(); i++){
			num2 = num2 * 10 + (string.charAt(i) - '0');
		}
		return num2;
	}
}