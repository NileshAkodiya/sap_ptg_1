package com.yash1.lab1assignment1;

public class LabOneAssignmentOne {

	public int calculateSum(int n) {
		int sum=0;
		while(n>0) {
			int d=n%10;
			sum=sum+(d*d*d);
			n/=10;
		}
		
		return sum;
	}

}
