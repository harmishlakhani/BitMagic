/**
 * This class represents overflow scenario for
 *  byte, short, int and long primitives.
 */
package com.github;

public class IntegerOverflow {

	// 2 ^ 8 = 256
	// 1 bit is used for sign and other are contributed to value.
	// 1 -> -ve and 0 -> +ve
	public void byteOverflow() {
		
		//2 ^ 7 {0 to (2 ^ 7) - 1)}
		// 0 to 127
		byte maxValue = Byte.MAX_VALUE;
		
		//2 ^ 7 {-1 to (2 ^ 7) * -1}
		// -1 to -128
		byte minValue = Byte.MIN_VALUE;
		
		System.out.println("Max value for byte is : " + maxValue);
		System.out.println("Min value for byte is : " + minValue);
		
		//After adding 1 to maxValue it goes to negative end of byte and vice versa
		//Reason :  for adding cast to byte is that any operation on byte, short and int is 
		// 			converted to int so in order to show overflow added cast.
		maxValue = (byte)(maxValue + 1);
		System.out.println("After adding 1 (overflow) : " + maxValue);
		minValue = (byte)(minValue - 1);
		System.out.println("After subtracting 1 (overflow) : " + minValue);
	}
		
	// 2 ^ 16 = 65536
	public void shortOverflow() {
		
		//2 ^ 15 {0 to (2 ^ 15) - 1)}
		// 0 to 32767
		short maxValue = Short.MAX_VALUE;
		
		//2 ^ 15 {-1 to (2 ^ 15) * -1}
		// -1 to -32768
		short minValue = Short.MIN_VALUE;
		
		System.out.println("Max value for short is : " + maxValue);
		System.out.println("Min value for short is : " + minValue);
		
		//After adding 1 to maxValue it goes to negative end of short and vice versa
		maxValue = (short)(maxValue + 1);
		System.out.println("After adding 1 (overflow) : " + maxValue);
		minValue = (short)(minValue - 1);
		System.out.println("After subtracting 1 (overflow) : " + minValue);
	}
	
	// 2 ^ 32 = 4294967296
	public void intOverflow() {
		
		//2 ^ 31 {0 to (2 ^ 31) - 1)}
		int maxValue = Integer.MAX_VALUE;
		
		//2 ^ 31 {-1 to (2 ^ 31) * -1}
		int minValue = Integer.MIN_VALUE;
		
		System.out.println("Max value for integer is : " + maxValue);
		System.out.println("Min value for integer is : " + minValue);
		
		//After adding 1 to maxValue it goes to negative end of int and vice versa
		maxValue++;
		System.out.println("After adding 1 (overflow) : " + maxValue);
		minValue--;
		System.out.println("After subtracting 1 (overflow) : " + minValue);
	}
	
	// 2 ^ 64 = 18446744073709551616
	public void longOverflow() {
		
		//2 ^ 63 {0 to (2 ^ 63) - 1)}
		long maxValue = Long.MAX_VALUE;
		
		//2 ^ 63 {-1 to (2 ^ 63) * -1}
		long minValue = Long.MIN_VALUE;
		
		System.out.println("Max value for long is : " + maxValue);
		System.out.println("Min value for long is : " + minValue);
		
		//After adding 1 to maxValue it goes to negative end of long and vice versa
		maxValue++;
		System.out.println("After adding 1 (overflow) : " + maxValue);
		minValue--;
		System.out.println("After subtracting 1 (overflow) : " + minValue);
	}
	public static void main(String[] args) {
		
		IntegerOverflow obj = new IntegerOverflow();
		obj.byteOverflow();
		obj.shortOverflow();
		obj.intOverflow();
		obj.longOverflow();
	}

}
