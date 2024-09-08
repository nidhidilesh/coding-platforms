package com.nidhi;

import java.util.Random;

public class QuickSort {
	static int n = 10;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random r = new Random();
		
		int arr[] = new int[n];
		for(int i = 0;i<n;i++) {
			arr[i] = r.nextInt(n);
		}
		quicksort(arr, 0, arr.length-1);
		System.out.println("Array sorted in ascending order: ");
		for(int i = 0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
	}
	private static void quicksort(int[] arr, int lowIndex, int highIndex) {
		int pivot = highIndex;
		highIndex--;
		if(lowIndex>=highIndex) {
			return;
		}
		while(lowIndex < highIndex) {
			while(arr[lowIndex]<=arr[pivot] && lowIndex<highIndex) {
				lowIndex++;
			}
			while(arr[highIndex]>=arr[pivot] && lowIndex<highIndex) {
				highIndex--;
			}
			swap(arr,lowIndex,highIndex);
			for(int i = 0;i<n;i++) {
				System.out.print(arr[i]+" ");
			}
			System.out.println();
		}
		if(arr[lowIndex]>arr[pivot]) {
			swap(arr,lowIndex,pivot);
		}
		quicksort(arr,0,lowIndex);
		quicksort(arr,lowIndex+1,pivot);
	}
	public static void swap(int[] arr, int i,int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
}
