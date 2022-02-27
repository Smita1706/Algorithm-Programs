package com.bridgelabz.algorithmprograms;

import java.util.Scanner;

public class InsertionSort {
	static Scanner s = new Scanner(System.in);
	public void getElements(int number) {
		int arr[] = new int[number];
		System.out.println("Enter the elements :");
		for(int i = 0 ;i<number;i++) {
			arr[i] = s.nextInt();
		}
		InsertionSort.printArray(arr);
		InsertionSort.sortArray(arr);
		InsertionSort.printArray(arr);
	}

	static void printArray(int arr []) {
		System.out.println("Your array elements are :");
		for(int i =0 ;i<arr.length;i++) {
			System.out.println(arr[i] );
		}
	}

	static void sortArray(int arr []) {
		for (int i = 1; i < arr.length; i++) {
			int j = i;
			while(j > 0 && arr[j-1] > arr[j]) {
				int temp = arr[j];
				arr[j] = arr[j-1];
				arr[j-1] = temp;
				j--;
			}
		}
	}
	public static void main(String[] arg) {
		int number;
		InsertionSort sort = new InsertionSort();
		System.out.println("Enter the number of elements :");
		number = s.nextInt();
		sort.getElements(number);
	}
}
