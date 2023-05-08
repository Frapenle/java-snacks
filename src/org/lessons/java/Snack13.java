package org.lessons.java;

import java.util.Arrays;
import java.util.Random;

public class Snack13 {

	public static void main(String[] args) {
		Integer[] arr1 = { 1, 2, 3, 4, 5 };
		Integer[] arr2 = { 34, 35, 36, 37, 38 };
		
//		creo due array di lunghezza pari ai precedenti
		Integer[] newArr1 = new Integer[arr1.length];
		Integer[] newArr2 = new Integer[arr2.length];
		
//      swap del primo elemento
		newArr1[0] = arr2[0];
		newArr2[0] = arr1[0];
	
		for (int i = 1; i < arr1.length; i++) {
            newArr1[i] = arr1[i];
            newArr2[i] = arr2[i];
        }
		System.out.println("Original array 1 " + Arrays.asList(arr1));
		System.out.println("Original array 2 " + Arrays.asList(arr2));
		System.out.println("------------------");
		System.out.println("Swapped array 1 " + Arrays.asList(newArr1));
		System.out.println("Swapped array 2 " + Arrays.asList(newArr2));
	}

}
