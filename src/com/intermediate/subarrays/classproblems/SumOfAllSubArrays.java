package com.intermediate.subarrays.classproblems;
/*You are given an integer array A of length N.
You have to find the sum of all subarray sums of A.
More formally, a subarray is defined as a contiguous part of an array which we can obtain by deleting zero or more elements from either end of the array.
A subarray sum denotes the sum of all the elements of that subarray.*/
public class SumOfAllSubArrays {
	static int solve(int[] arr) {
		int sum=0;
		int n = arr.length;
		for(int i=0;i<n;i++) {
			sum+=(i+1)*(n-i)*arr[i];
		}
		return sum;
	}
	public static void main(String[] args) {
		int[] arr = {1, 2, 3};
		int[] arr2 = { 2, 1, 3};
		System.out.println(SumOfAllSubArrays.solve(arr));
		System.out.println(SumOfAllSubArrays.solve(arr2));
	}
}
