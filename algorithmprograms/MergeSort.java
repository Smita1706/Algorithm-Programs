package com.bridgelabz.algorithmprograms;
import java.util.Scanner;

public class MergeSort {
	int firstArrLength;
	int secondArrLength;
	int L[];
	int R[];
	static Scanner s = new Scanner(System.in);
	public int[] getElements(int number) {
		MergeSort sort = new MergeSort();
		int arr[] = new int[number];
		System.out.println("Enter the elements :");
		for(int i = 0 ;i<number;i++) {
			arr[i] = s.nextInt();
		}
		return arr;
	}
	void merge(int arr[], int left, int middle, int right){
		firstArrLength = middle - left + 1;
		secondArrLength = right - middle;
		L = new int [firstArrLength];
		R = new int [secondArrLength];
		for (int i=0; i<firstArrLength; ++i)
			L[i] = arr[left + i];
		for (int j=0; j<secondArrLength; ++j)
			R[j] = arr[middle + 1+ j];
		int i = 0, j = 0;
		int k = left;
		while (i < firstArrLength && j < secondArrLength){
			if (L[i] <= R[j]){
				arr[k] = L[i];
				i++;
			}
			else{
				arr[k] = R[j];
				j++;
			}
			k++;
		}
		while (i < firstArrLength){
			arr[k] = L[i];
			i++;
			k++;
		}
		while (j < secondArrLength){
			arr[k] = R[j];
			j++;
			k++;
		}
	}
	void sort(int arr[], int left, int right){
		if (left < right){
			int middle = (left+right)/2;
			sort(arr, left, middle);
			sort(arr , middle+1, right);
			merge(arr, left, middle, right);
		}
	}
	static void printArray(int arr[]){
		for (int i=0; i<arr.length; ++i)
			System.out.print(arr[i] + " ");
		System.out.println();
	}
	public static void main(String args[]){
		MergeSort ob = new MergeSort();
		System.out.println("Enter the number of elements :");
		int number = s.nextInt();
		int arr[] = ob.getElements(number) ;
		System.out.println("Given Array");
		printArray(arr);

		ob.sort(arr, 0, arr.length-1);

		System.out.println("\nSorted array");
		printArray(arr);
	}
}