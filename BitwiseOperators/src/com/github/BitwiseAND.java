/**
 * Bitwise AND(&) add 1 if and only if both bits are set
 * 
 * Output:
 * Number A : 23  --> 10111
 * Number B : 13  --> 1101
 * ---------------------------------------------------------------
 * Number A & B : 5  --> 101
 * 
 * Number A : 23  --> 10111
 * Number B : -13  --> 11111111111111111111111111110011
 * ---------------------------------------------------------------
 * Number A & B : 19  --> 10011
 * 
 * Number A : -23  --> 11111111111111111111111111101001
 * Number B : 13  --> 1101
 * ---------------------------------------------------------------
 * Number A & B : 9  --> 1001
 * 
 * Number A : -23  --> 11111111111111111111111111101001
 * Number B : -13  --> 11111111111111111111111111110011
 * ---------------------------------------------------------------
 * Number A & B : -31  --> 11111111111111111111111111100001
 * 
 */
package com.github;

public class BitwiseAND {

	public void and(int A, int B) {
		int and = A & B;
		System.out.println("Number A : " + A + "  --> " + Integer.toBinaryString(A));
		System.out.println("Number B : " + B + "  --> " + Integer.toBinaryString(B));
		System.out.println("---------------------------------------------------------------");
		System.out.println("Number A & B : " + and + "  --> " + Integer.toBinaryString(and));
		System.out.println();
	}
	
	public static void main(String[] args) {

		BitwiseAND obj = new BitwiseAND();
		obj.and(23, 13);
		obj.and(23, -13);
		obj.and(-23, 13);
		obj.and(-23, -13);
	}

}
