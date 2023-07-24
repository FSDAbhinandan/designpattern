package com.intermediate.introToArrays.classProblem;

public class ReverseArrayAntiClockWise {
	
	static int[] swap(int[] arr, int s, int e) {
		while(s<e) {
			int temp=arr[s];
			arr[s]=arr[e];
			arr[e]=temp;
			s++;
			e--;
		}
		return arr;
	}
	
	static int[] reverseAntiClockWise(int[] arr, int k) {
		int n = arr.length;
		int rotate = k%n;
		 arr = swap(arr,0,(n-rotate-1));
		 arr = swap(arr,(n-rotate), n-1);
		 return swap(arr,0,n-1);
	}
	
	public static void main(String[] args) {
		int[] arr = {3,-2,1,4,6,9,8};
		
		int[] reverseAntiClockWise = ReverseArrayAntiClockWise.reverseAntiClockWise(arr, 3);
		
		for(int ar: reverseAntiClockWise) {
			System.out.println(ar);
		}
	}

}
