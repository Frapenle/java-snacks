package org.lessons.java;

import java.util.Scanner;

public class SnackNine {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Insert height: ");
		int height = sc.nextInt();
		
		System.out.println("Insert width: ");
		int base = sc.nextInt();
		sc.close();
		
		int area = base * height;
		int perimeter = (height * 2) + (base * 2) ;
		
		System.out.println("Area is: " + area);
		System.out.println("Perimeter is: " + perimeter);
	}

}
