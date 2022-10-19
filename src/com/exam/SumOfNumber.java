/*
 step1: start
 step2:Take number 70 from user
 step3: Read number from user
 step4: initilized sum =0 and i=1
 step5: calculate sum = sum +i
 step6: Repeate step 5 until i<= number
 step7: print sum
 step8: stop
 */


package com.exam;
public class SumOfNumber {
	public static void main(String[] args) {
		int num = 70;
		int sum = 0;
		for(int i=1;i<=num;i++)
		{
			sum=sum+i;
			
		}
		
		System.out.println("Sum of number is :" +sum );
	}

}
