/**
 * Bitwise rightShift(>>>) shift the bits from right to left n times
 * 	but doesn't include sign bit.
 * 
 * Output:
 * Number A : 23  --> 10111
 * Number A after 2 shift : 5  --> 101
 * 
 * Number A : -23  --> 11111111111111111111111111101001
 * Number A after 2 shift : 1073741818  --> 111111111111111111111111111010
 * 
 * Number A : 2147483647  --> 1111111111111111111111111111111
 * Number A after 10 shift : 2097151  --> 111111111111111111111
 * 
 * Number A : -2147483648  --> 10000000000000000000000000000000
 * Number A after 10 shift : 2097152  --> 1000000000000000000000
 * 
 */
package com.github;

public class BitwiseUnsignedRightShift {

	public void rightShift(int A, int n) {
		
		int number = A >>> n;
		System.out.println("Number A : " + A + "  --> " + Integer.toBinaryString(A));
		System.out.println("Number A after " + n + " shift : " + number + "  --> " + Integer.toBinaryString(number));
		System.out.println();
	}
	
	public static void main(String[] args) {

		BitwiseUnsignedRightShift obj = new BitwiseUnsignedRightShift();
		obj.rightShift(23, 2);
		obj.rightShift(-23, 2);
		
		obj.rightShift(Integer.MAX_VALUE, 10);
		obj.rightShift(Integer.MIN_VALUE, 10);
	}

}
