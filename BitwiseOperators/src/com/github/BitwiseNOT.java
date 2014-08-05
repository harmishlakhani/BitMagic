/**
 * In Java +ve numbers are stored as simple binary number,
 *    while -ve numbers are stored as two's complement of absolute 
 *    value of that number.
 *  
 * Bitwise NOT(~) simply revert the bit(0 to 1 and 1 to 0)
 * 
 * Output:
 * (~23) is : -24
 * 23 in binary is : 10111
 * ~23 in binary is : 11111111111111111111111111101000
 * (~ -23) is : 22
 * -23 in binary is : 11111111111111111111111111101001
 * ~(-23) in binary is : 10110
 * 
 */
package com.github;

public class BitwiseNOT {

	public void not(int number) {
		
		System.out.println("~" + number + " is : " + ~number);
		System.out.println(number + " in binary is : " + Integer.toBinaryString(number));
		System.out.println("~" + number + " in binary is : " + Integer.toBinaryString(~number));
		
	}
	
	public static void main(String[] args) {

		BitwiseNOT obj = new BitwiseNOT();
		obj.not(23);
		obj.not(-23);
	}

}
