package org.lessons.java;

import java.util.Scanner;

public class Palindroma {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Inserisci una parola per verificare se e' palindroma");
		String word = sc.nextLine();
		sc.close();
//		String reverseWord = "";
//		for (int i = word.length() - 1; i >= 0; i-- ) {
//			reverseWord += word.charAt(i);
//		}
//		
//		if(reverseWord.equals(word)) {
//			System.out.println(word + " e' palindroma");
//		} else {
//			System.out.println(word + " non e' palindroma");
//		}
		
		StringBuilder sb = new StringBuilder(word);
		String reverseWord = sb.reverse().toString();

		if(reverseWord.equals(word)) {
			System.out.println(word + " e palindroma");
		} else {
			System.out.println(word + " non e palindroma");
		}
	}
}
