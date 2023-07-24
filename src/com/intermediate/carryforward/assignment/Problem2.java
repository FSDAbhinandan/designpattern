package com.intermediate.carryforward.assignment;
//Given an array A, find the size of the smallest subarray such that it contains at least one occurrence of the maximum value of the array
//and at least one occurrence of the minimum value of the array.
public class Problem2 {
	static int solve(int[] arr) {
		int min =Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		
		for(int i=0;i<arr.length;i++) {
			min=Math.min(min, arr[i]);
			max= Math.max(max, arr[i]);
		}
		if(min==max)
			return 1;
		int min2 = Integer.MAX_VALUE;
		int max2 = Integer.MAX_VALUE;
		
		int ans = Integer.MAX_VALUE;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==min) {
				min2 = i;
				if(max2!=Integer.MAX_VALUE)
					ans= Math.min(ans, i-max2+1);
			}else if(arr[i]==max) {
				max2=i;
				if(min2!=Integer.MAX_VALUE)
					ans= Math.min(ans, i-min2+1);
			}
				
				
		}
		
		System.out.println(min+" "+ max);
		return ans;
	}
	public static void main(String[] args) {
		int[] arr = {2, 6, 1, 6, 9};
		int[] arr2 = {6,2,3,4,1,6,4,1};
		int[] arr3 = {6,6,6,6,6};
		
		System.out.println(Problem2.solve(arr));
		System.out.println(Problem2.solve(arr2));
		System.out.println(Problem2.solve(arr3));
	}
}
