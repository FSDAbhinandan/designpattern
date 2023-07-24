package com.intermediate.prefixsum.classproblems;
//Given an array, return true if equilibrium index exists
//sum of left side == sum of right side(excluding current index)
public class EqulibiriumIndex {

	static boolean checkEQ(int[] arr) {
		int n = arr.length;
		int[] ps = new int[n];
		ps[0]= arr[0];
		for(int i=1;i<n;i++){
			ps[i] = ps[i-1]+ arr[i];
		}
		int sl=0;
		int sr=0;
		for(int i=0;i<n;i++) {
			if(i==0)
				sl=0;
			else
				sl=ps[i-1];
			if(i==n-1)
				sr=0;
			else
				sr=ps[n-1]-ps[i];
			
			if(sr==sl)
				return true;
		}
		return false;
	}
	public static void main(String[] args) {
		int arr[] = {1,2,3,5,8,10};
		
		System.out.println(EqulibiriumIndex.checkEQ(arr));
	}
}
