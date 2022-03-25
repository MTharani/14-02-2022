package com.Generalprogram;

import java.util.Scanner;

public class Addition {

	public static void main(String[] args) {
		int num1, num2, sum, mul;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the first Number");
		num1 = scanner.nextInt();
		System.out.println("Enter the Second Number");
		num2 = scanner.nextInt();
		sum = num1 + num2;
		mul=sum*2;
		System.out.println("sum of two number:"+sum);
		System.out.println("The number is "+mul);
		scanner.close();
		
		
		
		

	}

}
