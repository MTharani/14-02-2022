package com.Generalprogram;

import java.util.Scanner;

public class Premeter {

	public static void main(String[] args) {
		int radius;
        double pi = 3.14, preimeter;
        Scanner scanner= new Scanner(System.in);
        System.out.println(" enter the radius value:");
        radius= scanner.nextInt();
        preimeter= 2*pi*radius;
        System.out.println("Preimeter of circle is:"+preimeter);
        scanner.close();
        
      

	}

}
