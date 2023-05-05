package org.lessons.java;

import java.util.Arrays;
import java.util.Random;

public class SnackEight {

	public static void main(String[] args) {
		int evenIndex = 0;
		int oddIndex = 0;
		Integer[] evenArray = new Integer[10];
		Integer[] oddArray = new Integer[10];
		
		Random r = new Random();
		for(int i = 0; i < 10; i++) {
			int rNumber = r.nextInt(0, 101);
			System.out.println(rNumber);
			
			if(rNumber % 2 == 0) {
				evenArray[evenIndex++] = rNumber;
			} else {
				oddArray[oddIndex++] = rNumber;
			}
		}
		System.out.println(Arrays.asList(evenArray));
		System.out.println(Arrays.asList(oddArray));
	}

}
