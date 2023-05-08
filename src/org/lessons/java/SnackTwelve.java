package org.lessons.java;

import java.util.Arrays;

public class SnackTwelve {

	public static void main(String[] args) {
		Integer[] arr1 = { 1, 2, 3, 4, 5 };
		Integer[] arr2 = { 34, 35, 36, 37, 38 };

		int arr1lng = arr1.length;
		int arr2lng = arr2.length;
		int newArrayLng = arr1lng + arr2lng;
//		
		Integer[] newArray = new Integer[newArrayLng];
		for(int i = 0; i < arr1lng; i++) {
			newArray[i] = arr1[i];
		}
		for(int i = 0; i < arr2lng; i++) {
			newArray[arr1lng + i] = arr2[i];
		}
		System.out.println(Arrays.asList(newArray));
	}
}
