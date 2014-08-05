/**
 * This class provide usage of left shift.
 * 
 * 1) Multiplication by 2 : it is accomplish by left shifting the number by 1.
 * 							if want to multiply by 2, n times (number * (2 ^ n))
 * 								then left shift the number by n. 
 * Output : 
 * Number A : 23  --> 10111
 * Number A * 2 : 46  --> 101110
 * 
 * Number A : -23  --> 11111111111111111111111111101001
 * Number A * 2 : -46  --> 11111111111111111111111111010010
 * 
 * Number A : 2147483647  --> 1111111111111111111111111111111
 * Number A * 2 : -2  --> 11111111111111111111111111111110
 */
package com.github;

public class LeftShiftApplications {

	public void mulby2(int A) {
		
		int number = A << 1;
		System.out.println("Number A : " + A + "  --> " + Integer.toBinaryString(A));
		System.out.println("Number A * 2 : " + number + "  --> " + Integer.toBinaryString(number));
		System.out.println();
	}
	
	public static void main(String[] args) {

		LeftShiftApplications obj = new LeftShiftApplications();
		obj.mulby2(23);
		obj.mulby2(-23);
		obj.mulby2(Integer.MAX_VALUE);
	}

}
