package com.Generalprogram;

import java.util.Scanner;

public class Product {

	public static void main(String[] args) {
		int a, b, c,d;
		Scanner scanner= new Scanner(System.in);
		System.out.println("Enter the first Number");
		a = scanner.nextInt();
		System.out.println("Enter the Second Number");
		b = scanner.nextInt();
		c=a*b;
		System.out.println("Product of two number:"+c);
		d=c-a;
		System.out.println("subtract of two number:"+d);
		scanner.close();
		
		

	}

}
