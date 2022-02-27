package com.bridgelabz.algorithmprograms;

import java.util.Arrays;
import java.util.Scanner;
public class PrimeNumberInRange {

	public String[] findPrime(int start, int end) {
		int i,j;
		boolean prime = false ;
		String[] array = new String[1000];
		int position = 0;
		for(i = start;i<=end;i++) {
			for (j = 2; j < i; j++){
				if (i % j == 0) {
					prime = false;
					break;
				}
				else {
					prime = true;

				}
			}
			if(prime == true) {
				System.out.println(i);
				array[position] = String.valueOf(i);
				position++;
			}
		}
		return array;

	}

	public static void main(String[] arg) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the range from :");
		int start = s.nextInt();
		System.out.println("Enter the range to:");
		int end = s.nextInt();
		PrimeNumberInRange primeObj = new PrimeNumberInRange();
		primeObj.findPrime(start, end);

	}
}
