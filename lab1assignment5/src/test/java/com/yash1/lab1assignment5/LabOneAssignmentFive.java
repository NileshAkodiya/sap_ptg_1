package com.yash1.lab1assignment5;

public class LabOneAssignmentFive {
	private int sum=0;

	public int calculateSum(int n) throws NumberFormatException{

		try {
			for(int i=1;i<=n;i++) {

				if(i%3==0 || i%5==0) {
					sum+=i;
				}
			}
			return sum;

		}catch(Exception e) {
			return 0;
		}
	}


}
