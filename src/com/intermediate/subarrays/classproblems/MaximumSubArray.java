package com.intermediate.subarrays.classproblems;
/*You are given an integer array C of size A. Now you need to find a subarray (contiguous elements) so that the sum of contiguous elements is maximum.
But the sum must not exceed B.*/
public class MaximumSubArray {
	 public static int maxSubarray(int A, int B, int[] C) {//this function is yet to be completed
		 int sum=0,ans=0;
		 int i=0,j;
		 if(C.length>=2) 
			 j=1;
		 else 
			 return 0;
		 sum=C[i];
		 while(i<j) {
			 if(sum<B) {
				 sum=sum+C[j];
				 if( j<C.length-1)
				    j++;
			 }else {
				 sum=sum-C[i];
				 i++;
			 }
			 if(sum <= B) {
				 ans=Math.max(ans, sum);
			 }
//			(sum <= B) ? (ans=Math.max(ans, sum)):ans; 
		 }
		 return ans;
	    }
	 
	    public static int maxSubarray1(int A, int B, int[] C) {
	        int max= Integer.MIN_VALUE;
	        int ans=0;
	        for(int i=0;i<A;i++){
	            int sum=0;
	            for(int j=i;j<A;j++){
	                sum+=C[j];
	                if(sum<=B && sum>max){
	                   max=sum;
	               }
	            }
	        }
	        return (max==Integer.MIN_VALUE)?0:max;
	    }
	 public static void main(String[] args) {
		 int[] arr = {2,1,3,4,5};
		 int[] arr1 = {7,1,8,5,8,5,3,3,5};
		 
		System.out.println(MaximumSubArray.maxSubarray(5, 12, arr));
		System.out.println(MaximumSubArray.maxSubarray(9, 78, arr1));
		System.out.println(MaximumSubArray.maxSubarray1(5, 12, arr));
		System.out.println(MaximumSubArray.maxSubarray1(9, 78, arr1));
	}
}
