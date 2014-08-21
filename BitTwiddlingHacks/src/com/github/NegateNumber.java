/**
 * This class is used to negate a number.
 * 
 * It uses 2 approaches.
 * 
 * 1. negate the number and add 1 to it(2's complement).
 * 2. multiply number with -1 or 1 based on condition.
 * 
 */
package com.github;

public class NegateNumber {

	//1 = true
	//0 = false
	//flag ? -number : number
	public int negateWhenTrue(int number, int flag) {
		return (number ^ -flag) + flag;
	}
	
	//1 = true
	//0 = false
	//flag ? number : -number;
	public int negateWhenFalse(int number, int flag) {
		return (flag ^ (flag - 1)) * number;
	}
	
	public static void main(String[] args) {

		NegateNumber obj = new NegateNumber();
		
		System.out.println("negateWhenFalse(23, 1) is : " + obj.negateWhenFalse(23, 1));
		System.out.println("negateWhenFalse(23, 0) is : " + obj.negateWhenFalse(23, 0));
		
		System.out.println("negateWhenFalse(-23, 1) is : " + obj.negateWhenFalse(-23, 1));
		System.out.println("negateWhenFalse(-23, 0) is : " + obj.negateWhenFalse(-23, 0));
		
		System.out.println("negateWhenTrue(23, 1) is : " + obj.negateWhenTrue(23, 1));
		System.out.println("negateWhenTrue(23, 0) is : " + obj.negateWhenTrue(23, 0));
		
		System.out.println("negateWhenTrue(-23, 1) is : " + obj.negateWhenTrue(-23, 1));
		System.out.println("negateWhenTrue(-23, 0) is : " + obj.negateWhenTrue(-23, 0));
	}

}
