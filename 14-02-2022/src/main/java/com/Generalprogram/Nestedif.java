package com.Generalprogram;

import java.util.Scanner;

public class Nestedif {

	public static void main(String[] args) {
		int number;
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter the number:");
		number=scanner.nextInt();
		if (number>0)
		{
			System.out.println("Positive Number");
			if(number%2==0)
			{
				System.out.println("Even Number");
			}
			else
			{
				System.out.println("odd Number");
			}
		}
		else 
		{
			System.out.println("Negative Number");
		}
		scanner.close();

	}

}
