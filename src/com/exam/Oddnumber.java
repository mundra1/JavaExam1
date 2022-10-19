/*
 step1: start
 step2: Take a input from user
 step3:start i from 1001 t0 1200
 step3: if i mod 2 is not equal to 0
 step4: Display i
 step5: stop
 */


package com.exam;

public class Oddnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num =1200;
		System.out.println("Print odd number:" +num+"");
		for(int i=1001;i<=num;i++)
		{
			if(i%2!=0)
			{
				System.out.println(i+ "");
			}
		}
		
	}
	

	}


