package com.intermediate.carryforward.classproblems;
//Given a string of lower case character, return the count of pairs
//where i<j
//s[i]=a;
//s[j]=g
public class FindAGPair {

	static int findAG(String str) {
		int countA=0;
		int ansAG =0;
		
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)=='a')
				countA++;
			if(str.charAt(i)=='g')
				ansAG+=countA;
		}
		
		return ansAG;
	}
	
	public static void main(String[] args) {
		String str ="acgdgag";
		System.out.println(FindAGPair.findAG(str));
		String str2 = "acbagkag";
		System.out.println(FindAGPair.findAG(str2));
	}
}
