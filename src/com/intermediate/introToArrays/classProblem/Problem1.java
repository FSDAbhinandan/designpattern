package com.intermediate.introToArrays.classProblem;
//Given Integer array of element, count number of elements having atleast 1 number greater than itself
public class Problem1 {
	static int count(int arr[]) {
		int max= Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max)
				max=arr[i];
		}
		
		int count =0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==max)
				count++;
		}
		
		return arr.length-count;
	}
	public static void main(String[] args) {
		int[] arr = {-3,-2,6,8,4,8,5};
		System.out.println(Problem1.count(arr));
	}

}
