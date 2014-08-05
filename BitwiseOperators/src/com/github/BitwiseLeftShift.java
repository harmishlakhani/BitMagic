/**
 * Bitwise leftShift(<<) shift the bits from right to left  n times
 * 	and padded 0 on right hand side
 * 
 * Output:
 * Number A : 23  --> 10111
 * Number A after 5 shift : 736  --> 1011100000
 * 
 * Number A : -23  --> 11111111111111111111111111101001
 * Number A after 3 shift : -184  --> 11111111111111111111111101001000
 * 
 * Number A : 2147483647  --> 1111111111111111111111111111111
 * Number A after 10 shift : -1024  --> 11111111111111111111110000000000
 * 
 */
package com.github;

public class BitwiseLeftShift {

	public void leftShift(int A, int n) {
		
		int number = A << n;
		System.out.println("Number A : " + A + "  --> " + Integer.toBinaryString(A));
		System.out.println("Number A after " + n + " shift : " + number + "  --> " + Integer.toBinaryString(number));
		System.out.println();
	}
	
	public static void main(String[] args) {

		BitwiseLeftShift obj = new BitwiseLeftShift();
		obj.leftShift(23, 5);
		obj.leftShift(-23, 3);
		
		obj.leftShift(Integer.MAX_VALUE, 10);
	}

}
