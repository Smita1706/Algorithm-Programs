package com.bridgelabz.algorithmprograms;
import java.util.Arrays;
import java.util.Scanner;

public class Primenagram {
	public String[] findPrime(int range) {
		String[] array = new String[1000];
		int position = 0;
		for (int i = 2; i <= range; i++) {
			boolean isPrime = true;
			for (int j = 2; j <= i / 2; j++) {
				if ((i % j) == 0) {
					isPrime = false;
					break;
				}
			}
			if (isPrime) {
				array[position] = String.valueOf(i);
				position++;
			}
		}
		String[] returnArray = new String[position];
		for (int k = 0; k < position; k++) {
			returnArray[k] = array[k];
		}
		return returnArray;

	}

	public boolean findAnagram(String first , String second) {
		if (first.length() != second.length()) {
			return false;
		}
		char[] array1 = first.toCharArray();
		Arrays.sort(array1);
		char[] array2 = second.toCharArray();
		Arrays.sort(array2);

		for (int i = 0; i < array1.length; i++) {
			if (array1[i] != array2[i]) {
				return false;
			}
		}
		return true;
	}
	public boolean palindrome(String string) {
		if (string.length() < 2) {
			return false;
		}
		char[] array = string.toCharArray();
		int n = array.length;
		for (int i = 0; i < n; i++) {
			if (array[i] != array[n - 1 - i]) {
				return false;
			}
		}
		return true;
	}
	public static void main(String[] arg) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the range :");
		int range = s.nextInt();
		Primenagram primeObj = new Primenagram();
		String[] prime = primeObj.findPrime(range);
		for(int i=0;i<prime.length;i++) {
			System.out.println(prime[i]);
		}
		for(int i = 0; i < prime.length; i++) {
			for(int j = i + 1; j < prime.length; j++) {
				if(primeObj.findAnagram(prime[i], prime[j])) {
					System.out.println(prime[i] + " " + prime[j]);
				}
			}
		}
		for(int i=0;i<prime.length;i++) {
			if(primeObj.palindrome(prime[i])){
				System.out.println(prime[i] + "is a pallindrome");
			}
		}
	}
}
