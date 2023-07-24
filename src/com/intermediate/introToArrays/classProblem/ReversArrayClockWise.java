package com.intermediate.introToArrays.classProblem;

public class ReversArrayClockWise {
	
	static int[] reverseClockwise(int[] arr, int k) {
		int rotate = k %arr.length;
		
		for(int i =0; i<=(rotate)/2; i++) {
			int temp = arr[i];
			arr[i] =arr[rotate-1-i];
			arr[rotate-1-i] = temp;
			
		}
		System.out.println((arr.length-rotate-1+arr.length-1)/2);
		int count =0;
		for(int i =arr.length-rotate-1; i<=(arr.length-rotate-1+arr.length-1)/2; i++) {
			int temp = arr[i];
			arr[i] = arr[arr.length-1-count];
			arr[arr.length-1-count] = temp;
			count++;
		}
		for(int i =0; i<=arr.length/2; i++) {
			int temp = arr[i];
			arr[i] = arr[arr.length-1-i];
			arr[arr.length-1-i] = temp;
		}
		
		
		return arr;
	}
	
	public static void main(String[] args) {
		int[] arr = {3,-2,1,4,6,9,8};
		int[] reverseClockwise = ReversArrayClockWise.reverseClockwise(arr, 3);
		
		for(int ar: reverseClockwise) {
			System.out.println(ar);
		}
	}

}
