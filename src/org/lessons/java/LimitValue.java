package org.lessons.java;

import java.util.Random;
import java.util.Scanner;

public class LimitValue {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Insert a number: ");
		int number = sc.nextInt();
		sc.close();
		
		Random r = new Random();
		int sum = 0;
		
		while(sum < number) {
			int rNumber = r.nextInt(0, 101);
			sum += rNumber;
			System.out.println(rNumber);
		}
		System.out.println("Total: " + sum);
	}
}
