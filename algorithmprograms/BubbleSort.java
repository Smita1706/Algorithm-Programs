package com.bridgelabz.algorithmprograms;
import java.util.Scanner;

public class BubbleSort {
	static Scanner s = new Scanner(System.in);
	public void getElements(int number) {
		int arr[] = new int[number];
		System.out.println("Enter the elements :");
		for(int i = 0 ;i<number;i++) {
			arr[i] = s.nextInt();
		}
		BubbleSort.printArray(arr);
		BubbleSort.sortArray(arr);
		BubbleSort.printArray(arr);
	}
	
	static void printArray(int arr []) {
		System.out.println("Your array elements are :");
		for(int i =0 ;i<arr.length;i++) {
			System.out.println(arr[i] );
		}
	}
	
	static void sortArray(int arr []) {
	    for (int i = 0; i < arr.length-1; i++)
	        for (int j = 0; j < arr.length-i-1; j++)
	            if (arr[j] > arr[j+1])
	            {
	                int temp = arr[j];
	                arr[j] = arr[j+1];
	                arr[j+1] = temp;
	            }
	}
	public static void main(String[] arg) {
		int number;
		BubbleSort sort = new BubbleSort();
		System.out.println("Enter the number of elements :");
		number = s.nextInt();
		sort.getElements(number);
	}
}
