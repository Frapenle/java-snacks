package org.lessons.java;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Insert a number: ");
		int number = sc.nextInt();
		
		sc.close();
		System.out.println(
				number % 2 == 0
				? "Number is even"
				: number + 1
				);
	}

}
