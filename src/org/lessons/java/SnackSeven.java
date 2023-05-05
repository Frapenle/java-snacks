package org.lessons.java;

import java.util.Random;

public class SnackSeven {
	public static void main(String[] args) {
		Random r = new Random();
		
		int rNumber = 1;
		while(rNumber % 15 != 0){
			rNumber = r.nextInt(0, 101);
			System.out.println(rNumber);	
		}
		System.out.println(rNumber + " is divisible for 3 and 5!");
	}

}
