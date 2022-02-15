package com.linecomparison;

import java.util.Scanner;

public class LineComparison {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please Enter x1");
		int x1 = sc.nextInt();
		
		System.out.println("Please Enter y1");
		int y1 = sc.nextInt();
		
		System.out.println("Please Enter x2");
		int x2 = sc.nextInt();
		
		System.out.println("Please Enter y2");
		int y2 = sc.nextInt();
		
		int val1 = (int) Math.pow((x2 -x1),2);
		int val2 = (int) Math.pow((y2 -y1),2);
		int result = (int) Math.sqrt(val1 + val2);
		
		System.out.println("Length of Line is = " +result);
		
		sc.close();
		

	}

}
