/*
 step1: start
 step2:take input c1,c2,c3,c4 from user
 step3: initilized num=60 and grade
 step4: read c1,c2,c3,c4 from user
 step5: calculate grade = (c1+c2+c3+c4)/4
 step6: if grade is greater or equal than num print pass
 step7: otherwise print Could not ablet to clear the exam
 step8: stop
 */


package com.exam;

import java.util.Scanner;
public class StudentExam {
	public static void main(String[] args) {
		int num = 60;
		double grade;
		Scanner scr = new Scanner(System.in);
		System.out.println("Enter score for c1:");
		double c1 = scr.nextDouble();
		System.out.println("Enter score for c2:");
		double c2 = scr.nextDouble();
		System.out.println("Enter score for c3:");
		double c3 = scr.nextDouble();
		System.out.println("Enter score for c4:");
		double c4 = scr.nextDouble();
		
		grade= (c1+c2+c3+c4)/4;
		
		if(grade >= num)
		{
		System.out.println("Pass");
	}
		else
			System.out.println("Could not ablet to clear the exam");

}
}
