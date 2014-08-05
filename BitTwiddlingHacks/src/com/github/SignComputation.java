/**
 * This class is used to detect sign of any number without using any conditional operator.
 * 
 * Method 1: if you need 0 as positive, -1 as negative then use following formula
 * 			 sign = number >> (Integer.SIZE - 1);
 *			 Ex : 1. if number is 0 or positive say 23 then 23 >> 31 = 000..00000(32 times) = 0
 *				  2. if number is negative say -23 then -23 >> 31 = 111...11111(32 times) = -1
 *
 * Method 2: if you need +1 as positive, -1 as negative and 0 as 0 then use following formula
 * 			 sign = 1 | number >> (Integer.SIZE - 1);
 * 
 * Method 3: if you need any non-negative number as +1 and rest as 0 then use following formula
 * 			 sign = 1 ^ number >>> (Integer.SIZE - 1);
 */
package com.github;

public class SignComputation {

	//if you need +1 as positive, -1 as negative and 0 as 0
	public int sign(int number) {
		int sign = 0;
		if(number != 0)
			sign = 1 | number >> (Integer.SIZE - 1);
		return sign;
	}
	
	//if you need non-negative number as +1 and rest(negative) as 0
	public int signNonNegative(int number) {
		int sign;
		sign = 1 ^ number >>> (Integer.SIZE - 1);
		return sign;
	}

	public int sign(byte number) {
		int sign = 0;
		if(number != 0)
			sign = 1 | number >> (Byte.SIZE - 1);
		return sign;
	}
	
	public int sign(short number) {
		int sign = 0;
		if(number != 0)
			sign = 1 | number >> (Short.SIZE - 1);
		return sign;
	}
	
	public int sign(long number) {
		int sign = 0;
		if(number != 0)
			sign = (int) (1 | number >> (Long.SIZE - 1));
		return sign;
	}
	
	//This will not handle the case for 0.xf because after casting it become 0.
	public int sign(float number) {
		return sign((int)number);
	}
	
	//This will handle all the cases
	public int signSpecial(float number) {
		if (number == 0) 
			return 0;
	    number *= Float.POSITIVE_INFINITY;
	    if (number == Float.POSITIVE_INFINITY) 
	    	return +1;
	    if (number == Float.NEGATIVE_INFINITY) 
	    	return -1;
	    return 0;
	}
	
	//This will not handle the case for 0.xf because after casting it become 0.
	public int sign(double number) {
		return sign((long)number);
	}
	
	//This will handle all the cases
	public int signSpecial(double number) {
		if (number == 0) 
			return 0;
	    number *= Double.POSITIVE_INFINITY;
	    if (number == Double.POSITIVE_INFINITY) 
	    	return +1;
	    if (number == Double.NEGATIVE_INFINITY) 
	    	return -1;
	    return 0;
	}
	
	public static void main(String[] args) {

		SignComputation obj = new SignComputation();
		
		//Integers
		System.out.println("Sign of 0 is : " + obj.sign(0));
		System.out.println("Sign of 23 is : " + obj.sign(23));
		System.out.println("Sign of -23 is : " + obj.sign(-23));
		System.out.println("Sign of -1 is : " + obj.sign(-1));
		System.out.println("Sign of Integer.MAX_VALUE is : " + obj.sign(Integer.MAX_VALUE));
		System.out.println("Sign of Integer.MIN_VALUE is : " + obj.sign(Integer.MIN_VALUE));
		
		System.out.println("Sign of 0 is : " + obj.signNonNegative(0));
		System.out.println("Sign of 23 is : " + obj.signNonNegative(23));
		System.out.println("Sign of -23 is : " + obj.signNonNegative(-23));
		System.out.println("Sign of -1 is : " + obj.signNonNegative(-1));
		System.out.println("Sign of Integer.MAX_VALUE is : " + obj.signNonNegative(Integer.MAX_VALUE));
		System.out.println("Sign of Integer.MIN_VALUE is : " + obj.signNonNegative(Integer.MIN_VALUE));
		
		//Bytes
		System.out.println("Sign of 0 is : " + obj.sign((byte)0));
		System.out.println("Sign of 23 is : " + obj.sign((byte)23));
		System.out.println("Sign of -23 is : " + obj.sign((byte)-23));
		System.out.println("Sign of -1 is : " + obj.sign((byte)-1));
		
		//Shorts
		System.out.println("Sign of 0 is : " + obj.sign((short)0));
		System.out.println("Sign of 23 is : " + obj.sign((short)23));
		System.out.println("Sign of -23 is : " + obj.sign((short)-23));
		System.out.println("Sign of -1 is : " + obj.sign((short)-1));
		
		//Longs
		System.out.println("Sign of 0 is : " + obj.sign(0l));
		System.out.println("Sign of 23 is : " + obj.sign(23l));
		System.out.println("Sign of -23 is : " + obj.sign(-23l));
		System.out.println("Sign of -1 is : " + obj.sign(-1l));
		System.out.println("Sign of Long.MAX_VALUE is : " + obj.sign(Long.MAX_VALUE));
		System.out.println("Sign of Long.MIN_VALUE is : " + obj.sign(Long.MIN_VALUE));
		
		//Floats
		System.out.println("Sign of 0 is : " + obj.sign(0.5f));
		System.out.println("Sign of 23 is : " + obj.sign(23.9f));
		System.out.println("Sign of -23 is : " + obj.sign(-23.8f));
		System.out.println("Sign of -1 is : " + obj.sign(-1.5f));
		System.out.println("Sign of Float.MAX_VALUE is : " + obj.sign(Float.MAX_VALUE));
		System.out.println("Sign of Float.MIN_VALUE is : " + obj.sign(Float.MIN_VALUE));
		System.out.println("Sign of Float.POSITIVE_INFINITY is : " + obj.sign(Float.POSITIVE_INFINITY));
		System.out.println("Sign of Float.NEGATIVE_INFINITY is : " + obj.sign(Float.NEGATIVE_INFINITY));
		
		System.out.println("Sign of 0 is : " + obj.signSpecial(0.5f));
		System.out.println("Sign of 23 is : " + obj.signSpecial(23.9f));
		System.out.println("Sign of -23 is : " + obj.signSpecial(-23.8f));
		System.out.println("Sign of -1 is : " + obj.signSpecial(-1.5f));
		System.out.println("Sign of Float.MAX_VALUE is : " + obj.signSpecial(Float.MAX_VALUE));
		System.out.println("Sign of Float.MIN_VALUE is : " + obj.signSpecial(Float.MIN_VALUE));
		System.out.println("Sign of Float.POSITIVE_INFINITY is : " + obj.signSpecial(Float.POSITIVE_INFINITY));
		System.out.println("Sign of Float.NEGATIVE_INFINITY is : " + obj.signSpecial(Float.NEGATIVE_INFINITY));
		
		//Doubles
		System.out.println("Sign of 0 is : " + obj.sign(0.5d));
		System.out.println("Sign of 23 is : " + obj.sign(23d));
		System.out.println("Sign of -23 is : " + obj.sign(-23.9d));
		System.out.println("Sign of -1 is : " + obj.sign(-1d));
		System.out.println("Sign of Double.MAX_VALUE is : " + obj.sign(Double.MAX_VALUE));
		System.out.println("Sign of Double.MIN_VALUE is : " + obj.sign(Double.MIN_VALUE));
		System.out.println("Sign of Double.POSITIVE_INFINITY is : " + obj.sign(Double.POSITIVE_INFINITY));
		System.out.println("Sign of Double.NEGATIVE_INFINITY is : " + obj.sign(Double.NEGATIVE_INFINITY));
		
		System.out.println("Sign of 0 is : " + obj.signSpecial(0.5d));
		System.out.println("Sign of 23 is : " + obj.signSpecial(23d));
		System.out.println("Sign of -23 is : " + obj.signSpecial(-23.9d));
		System.out.println("Sign of -1 is : " + obj.signSpecial(-1d));
		System.out.println("Sign of Double.MAX_VALUE is : " + obj.signSpecial(Double.MAX_VALUE));
		System.out.println("Sign of Double.MIN_VALUE is : " + obj.signSpecial(Double.MIN_VALUE));
		System.out.println("Sign of Double.POSITIVE_INFINITY is : " + obj.signSpecial(Double.POSITIVE_INFINITY));
		System.out.println("Sign of Double.NEGATIVE_INFINITY is : " + obj.signSpecial(Double.NEGATIVE_INFINITY));
	}

}
