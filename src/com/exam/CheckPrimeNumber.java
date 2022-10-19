/*
 step1: start
 step2:Take a input number from user
 step3:Read the number from user
 step4: check if num mod is equal to 0. if yes number is prime
 step5: otherwise number is not prime
 step6:stop
 */


package com.exam;
import java.util.Scanner;
public class CheckPrimeNumber {
	public static void main(String[] args) {
		int num, i;
		Scanner scr = new Scanner (System.in);
		System.out.print("Enter the number:");
		num = scr.nextInt();
		boolean isprime = false;
		for( i=2; i<=num/2;++i) {
			if(num % i==0) {
				isprime = true;
				break;
			}
		}
			
		if(!isprime)	
			System.out.println("The number is prime");
		else
			System.out.println("The number is not prime");
	}
	
	

}