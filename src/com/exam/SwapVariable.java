/*
 step1:start
 step2:Enter the value of x and y
 step3:print the value pf x and y
 step4:x=x+y
 step5:y=x-y
 step6:x=x-y
 step7:print the value of x and y
 step8:stop
 
 */


package com.exam;
public class SwapVariable {
	public static void main(String[] args) {
		int x=5;
		int y=10;
		System.out.println("The value of x:" +x);
		System.out.println("The value of y:" +y);
		System.out.println("The number after swapping");
		x=x+y;
		y=x-y;
		x=x-y;
		System.out.println("The value of x:" +x);
		System.out.println("The value of y:" +y);
		
	}
	}

