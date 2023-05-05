package org.lessons.java;

import java.util.Scanner;

public class SnackEleven {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Insert a number: ");
		int number = sc.nextInt();
		sc.close();
		
		for (int i = 1; i < number; i++) {
			if(number % i == 0) {
				System.out.println(i + " is divisible for " + number);
			}
		}
	}

}
