package org.lessons.java;

public class SumOddNumbers {

	public static void main(String[] args) {
		int[] intNumbers = {1, 4, 33, 12, 5, 9, 11, 1, 2};
		
		int sum = 0;
		
		for(int i = 0; i < intNumbers.length; i+=2) {
			int val = intNumbers[i];
			sum += val;
		}
		System.out.println(sum);
	}

}
