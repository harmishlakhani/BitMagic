/**
 * Bitwise XOR(^) add 1 if both bits are opposite, otherwise add 0
 * 
 * Output:
 * Number A : 23  --> 10111
 * Number B : 13  --> 1101
 * ---------------------------------------------------------------
 * Number A ^ B : 26  --> 11010
 * 
 * Number A : 23  --> 10111
 * Number B : -13  --> 11111111111111111111111111110011
 * ---------------------------------------------------------------
 * Number A ^ B : -28  --> 11111111111111111111111111100100
 * 
 * Number A : -23  --> 11111111111111111111111111101001
 * Number B : 13  --> 1101
 * ---------------------------------------------------------------
 * Number A ^ B : -28  --> 11111111111111111111111111100100
 * 
 * Number A : -23  --> 11111111111111111111111111101001
 * Number B : -13  --> 11111111111111111111111111110011
 * ---------------------------------------------------------------
 * Number A ^ B : 26  --> 11010
 * 
 */
package com.github;

public class BitwiseXOR {

	public void xor(int A, int B) {
		int xor = A ^ B;
		System.out.println("Number A : " + A + "  --> " + Integer.toBinaryString(A));
		System.out.println("Number B : " + B + "  --> " + Integer.toBinaryString(B));
		System.out.println("---------------------------------------------------------------");
		System.out.println("Number A ^ B : " + xor + "  --> " + Integer.toBinaryString(xor));
		System.out.println();
	}
	
	public static void main(String[] args) {

		BitwiseXOR obj = new BitwiseXOR();
		obj.xor(23, 13);
		obj.xor(23, -13);
		obj.xor(-23, 13);
		obj.xor(-23, -13);
	}

}
