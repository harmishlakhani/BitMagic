/**
 * This class represents overflow scenario for
 *  float and double primitives.
 */
package com.github;

public class DoubleOverflow {

	// 2 ^ 32 = 4294967296
	public void floatOverflow() {
		
		//2 ^ 31 {0 to (2 ^ 31) - 1)}
		float maxValue = Float.MAX_VALUE;
		
		//2 ^ 31 {-1 to (2 ^ 31) * -1}
		float minValue = Float.MIN_VALUE;
		
		System.out.printf("Max value for float is : %f", maxValue);
		System.out.println();
		System.out.printf("Min value for float is : %f", minValue);
		System.out.println();
		
		//After adding 1 to maxValue it goes to negative end of float and vice versa
		maxValue = maxValue + 1;
		System.out.printf("After adding 1 (overflow) : %f", maxValue);
		System.out.println();
		minValue = minValue - 1;
		System.out.printf("After subtracting 1 (overflow) :  %f", minValue);
		System.out.println();
	}
	
	// 2 ^ 64 = 18446744073709551616
	public void doubleOverflow() {
		
		//2 ^ 63 {0 to (2 ^ 63) - 1)}
		double maxValue = Double.MAX_VALUE;
		
		//2 ^ 63 {-1 to (2 ^ 63) * -1}
		double minValue = Double.MIN_VALUE;
		
		System.out.printf("Max value for double is : %f", maxValue);
		System.out.println();
		System.out.printf("Min value for double is : %f", minValue);
		System.out.println();
		
		//After adding 1 to maxValue it goes to negative end of double and vice versa
		maxValue = maxValue + 1;
		System.out.printf("After adding 1 (overflow) : %f", maxValue);
		System.out.println();
		minValue = minValue - 1;
		System.out.printf("After subtracting 1 (overflow) :  %f", minValue);
		System.out.println();
	}
	public static void main(String[] args) {
		
		DoubleOverflow obj = new DoubleOverflow();
		obj.floatOverflow();
		obj.doubleOverflow();
	}

}
