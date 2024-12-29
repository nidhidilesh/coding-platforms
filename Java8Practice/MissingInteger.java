package com.nidhi;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/** Program to find a missing integer from an array **/

public class MissingInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int arr[] = new int[N];
		int missingInteger = 0;
		for(int i = 0;i<N;i++) {
			arr[i] = sc.nextInt();
		}
		Arrays.sort(arr);
		int k = -1;
		for(int i=0;i<N;i++) {
			k = k+1;
			if(i>0 && arr[i]==arr[i-1]) {
				k--;
			}
			if(arr[i] == k+1) {
				continue;
			}
			else {
				 missingInteger=k+1;
				 break;
			}
		}
		if(missingInteger==0)missingInteger = N+1;
		System.out.println("missing integer = "+missingInteger);
	}
}
