/**
 * This class is used to find whether given no is 
 * 	power of 2 or not.
 * 
 * Method 1:
 * 	When no is power of two it's binary representation
 * 		contains only one 1 bit, rest are 0.
 *  if you subtract 1 value from no it's binary representation
 *  	contains all the 1 as shown below.
 *  
 *  16 -> 00010000
 *  15 -> 00001111
 *  16 & 15 -> 00000000
 *  
 *  Method 2:
 *  shift the number 1 left side by 1 position and check whether
 *  	it matches with the given number until the given number
 *  	become smaller.
 *  
 *  16 -> 00010000
 *  1 ->  00000001
 *  1 ->  1 << 1 -> 00000010
 *  2 ->  2 << 1 -> 00000100
 *  4 ->  4 << 1 -> 00001000
 *  until you find no else break;
 *   
 *  Second method doesn't work for Max case 
 *  so added one more if condition.
 */
package com.github;

public class PowerOfTwo {

	//Here 0 is also become power of 2
	//O(1)
	public boolean isPowerOfTwo(int A) {
		return (A & (A - 1)) == 0;
	}
	
	//O(n)
	public boolean isPowerOfTwoOn(int A) {
		int number = 1;
		while(A > number && number != Integer.MIN_VALUE) {
			number <<= 1;
		}
		return number == A;
	}
	
	public static void main(String[] args) {

		PowerOfTwo obj = new PowerOfTwo();
		System.out.println(obj.isPowerOfTwo(8));
		System.out.println(obj.isPowerOfTwo(57));
		System.out.println(obj.isPowerOfTwo(Integer.MAX_VALUE));
		
		System.out.println(obj.isPowerOfTwoOn(8));
		System.out.println(obj.isPowerOfTwoOn(57));
		System.out.println(obj.isPowerOfTwoOn(Integer.MAX_VALUE));
		
	}

}
