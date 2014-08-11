/**
 * Here we have used bit operator instead of reminder(%)
 * 
 * Odd number has 1 as the LSB bit
 * Even number has 0 as the LSB bit
 * 
 * Odd Number AND 1(000......0001) = 1(0000......00001)
 * 
 */
package com.github;

public class OddNumber {

	public boolean odd(int number) {
		return (number & 1) == 1;
	}
	public static void main(String[] args) {

		OddNumber obj = new OddNumber();
		
		System.out.println("1 is odd : " + obj.odd(1));
		System.out.println("Integer.MAX_VALUE is odd : " + obj.odd(Integer.MAX_VALUE));
		System.out.println("10 is odd : " + obj.odd(10));
		
	}

}
