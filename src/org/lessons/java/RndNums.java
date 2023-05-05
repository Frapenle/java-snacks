package org.lessons.java;

import java.util.Random;
import java.util.Scanner;

public class RndNums {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Insert a number:");
		int number = sc.nextInt();
		int total = 0;
		int evenSum = 0;
		int oddSum = 0;
		int minVal = 100;
		int maxVal = 0;
		
		Random r = new Random();
		
		for(int i = 0; i < number; i++) {
			int randomNumber = r.nextInt(0, 100);
			System.out.println(randomNumber);
			total += randomNumber;
			if( randomNumber % 2 == 0) {
				evenSum += randomNumber;
			} else {
				oddSum += randomNumber;
			}
			
			if(randomNumber < minVal) {
				minVal = randomNumber;
			}
			if(randomNumber > maxVal) {
				maxVal = randomNumber;
			}
		}
		
		System.out.println("Totale: " + total);
		System.out.println("Even total: " + evenSum);
		System.out.println("Odd total: " + oddSum);
		System.out.println("Media: " + total / number);
		System.out.println("Media odd value: " + oddSum / number);
		System.out.println("Min value: " + minVal);
		System.out.println("Max value: " + maxVal);
		sc.close();
		

	}

}
