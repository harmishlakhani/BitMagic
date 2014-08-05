/**
 * Bitwise OR(|) add 1 if any of the one bit is set
 * 
 * Output:
 * Number A : 23  --> 10111
 * Number B : 13  --> 1101
 * ---------------------------------------------------------------
 * Number A | B : 31  --> 11111
 * 
 * Number A : 23  --> 10111
 * Number B : -13  --> 11111111111111111111111111110011
 * ---------------------------------------------------------------
 * Number A | B : -9  --> 11111111111111111111111111110111
 * 
 * Number A : -23  --> 11111111111111111111111111101001
 * Number B : 13  --> 1101
 * ---------------------------------------------------------------
 * Number A | B : -19  --> 11111111111111111111111111101101
 * 
 * Number A : -23  --> 11111111111111111111111111101001
 * Number B : -13  --> 11111111111111111111111111110011
 * ---------------------------------------------------------------
 * Number A | B : -5  --> 11111111111111111111111111111011
 * 
 */
package com.github;

public class BitwiseOR {

	public void or(int A, int B) {
		int or = A | B;
		System.out.println("Number A : " + A + "  --> " + Integer.toBinaryString(A));
		System.out.println("Number B : " + B + "  --> " + Integer.toBinaryString(B));
		System.out.println("---------------------------------------------------------------");
		System.out.println("Number A | B : " + or + "  --> " + Integer.toBinaryString(or));
		System.out.println();
	}
	
	public static void main(String[] args) {

		BitwiseOR obj = new BitwiseOR();
		obj.or(23, 13);
		obj.or(23, -13);
		obj.or(-23, 13);
		obj.or(-23, -13);
	}

}
