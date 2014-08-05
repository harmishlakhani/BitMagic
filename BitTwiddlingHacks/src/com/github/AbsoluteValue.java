/**
 * This class finds absolute value of any integer.
 * 
 * Explanation:
 *  -ve numbers are stored as 2's complement.
 *   2's complement = 1's complement + 1.
 *   2's complement - 1 = 1's complement.
 *   2's complement + (-1) = 1's complement.
 *   mask = number >> Integer.SIZE - 1 = 0 for positive
 *   			     				   = -1 for negative
 *   
 *   2's complement + mask = 1's complement
 *   abs(number) = 1's complement ^ mask.
 *   
 *   Here we can not use NOT to gain absolute
 *   value from 1's complement because it will
 *   make +ve to -ve.
 *   
 *   While XOR will keep +ve as +ve and make
 *   -ve to +ve.
 *   
 *   NOTE : because of overflow Integer.MIN_VALUE
 *   give same -ve value as a absolute value.
 *   
 * Output :
 *  
 * abs(-23) is : 23
 * abs(40) is : 40
 * abs(Integer.MAX_VALUE) is : 2147483647
 * abs(Integer.MIN_VALUE) is : -2147483648
 * abs(Integer.MIN_VALUE + 1) is : 2147483647
 */
package com.github;

public class AbsoluteValue {

	public int abs(int number) {
		int mask = number >> Integer.SIZE - 1;
		return (number + mask) ^ mask;
	}
	
	public static void main(String[] args) {

		AbsoluteValue obj = new AbsoluteValue();
		
		System.out.println("abs(-23) is : " + obj.abs(-23));
		System.out.println("abs(40) is : " + obj.abs(40));
		System.out.println("abs(Integer.MAX_VALUE) is : " + obj.abs(Integer.MAX_VALUE));
		System.out.println("abs(Integer.MIN_VALUE) is : " + obj.abs(Integer.MIN_VALUE));
		System.out.println("abs(Integer.MIN_VALUE + 1) is : " + obj.abs(Integer.MIN_VALUE + 1));
	}

}
