package org.lessons.java;

import java.util.Scanner;

public class SnackTen {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Insert radius: ");
		int radius = sc.nextInt();
		sc.close();
		
		double area = Math.PI * (radius * radius);
		double circumference = Math.PI * (radius * 2) ;
		
		System.out.println("Area is: " + area);
		System.out.println("Circumference is: " + circumference);
	}

}
