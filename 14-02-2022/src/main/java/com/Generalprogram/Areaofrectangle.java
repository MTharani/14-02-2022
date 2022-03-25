package com.Generalprogram;

import java.util.Scanner;

public class Areaofrectangle {

	public static void main(String[] args) {
		int area,length,width;
		Scanner scanner= new Scanner(System.in);
		System.out.println("Enter the Length:");
		length=scanner.nextInt();
		System.out.println("Enter the Width:");
		width=scanner.nextInt();
		area=length*width;
		System.out.println("Area of Rectangle:"+area);
		scanner.close();
		

	}

}
