/**
 * This is the efficient implementation for AND Gate
 * using ONLY one ternary operator.
 * 
 * 1. a ? ( b ? true : false) : false -> uses 2 ternary operator
 * 2. a ? b : a -> uses ONLY 1 ternary operator 
 */
package com.github;

public class ANDGateWithOneTernaryOnly {

	public boolean andGate(boolean a, boolean b) {
		
		return a ? b : a;
	}
	
	public static void main(String[] args) {

		ANDGateWithOneTernaryOnly obj = new ANDGateWithOneTernaryOnly();
		
		System.out.println("True AND True is  : " + obj.andGate(true, true));
		System.out.println("True AND False is  : " + obj.andGate(true, false));
		System.out.println("False AND True is  : " + obj.andGate(false, true));
		System.out.println("False AND False is  : " + obj.andGate(false, false));
	}

}
