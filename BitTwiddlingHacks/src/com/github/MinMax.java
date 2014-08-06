/**
 * This class is used to find min and max of two numbers.
 * 
 * Method 1(minimum):
 *  
 * case 1 : A < B
 * 	A < B ? -1 : 0 ==> -1(11.1111)
 *  (A ^ B) & 11.111 = A ^ B
 *  result = B ^ A ^ B = A
 *  
 * case 2 : A >= B
 * 	A < B ? -1 : 0 ==> 0(00..000)
 *  (A ^ B) & 00..000 = 0
 *  result = B ^ 0= B
 *  
 * Method 2(minimum):
 *  
 * case 1 : A < B
 *  diff = -ve
 *  diff >> 31 = -1(11..111)
 *  diff & -1 = diff
 *  result = B + A - B = A
 *  
 * case 2 : A >= B
 *  diff = +ve
 *  diff >> 31 = 0(00..000)
 *  diff & 0 = 0
 *  result = B + 0 = B
 *   
 * Second method doesn't work for Min - Max case 
 *  	because of overflow.
 */
package com.github;

public class MinMax {

	public int min1(int A, int B) {
		int result;
		result = B ^ ((A ^ B) & (A < B ? -1 : 0));
		return result;
	}
	
	public int min2(int A, int B) {
		int result;
		int diff = A - B;
		result = B + (diff & (diff >> Integer.SIZE - 1));
		return result;
	}
	
	public int max1(int A, int B) {
		int result;
		result = A ^ ((A ^ B) & (A < B ? -1 : 0));		
		return result;
	}
	
	public int max2(int A, int B) {
		int result;
		int diff = A - B;
		result = A - (diff & (diff >> Integer.SIZE - 1));
		return result;
	}
	
	public static void main(String[] args) {

		MinMax obj = new MinMax();
		
		//Min
		System.out.println(obj.min1(10, 15));
		System.out.println(obj.min1(-10, 15));
		System.out.println(obj.min1(10, -15));
		System.out.println(obj.min1(-10, -15));
		System.out.println(obj.min1(Integer.MIN_VALUE , Integer.MAX_VALUE));
		
		//Max
		System.out.println(obj.max1(10, 15));
		System.out.println(obj.max1(-10, 15));
		System.out.println(obj.max1(10, -15));
		System.out.println(obj.max1(-10, -15));
		System.out.println(obj.max1(Integer.MIN_VALUE , Integer.MAX_VALUE));
		
		//Min
		System.out.println(obj.min2(10, 15));
		System.out.println(obj.min2(-10, 15));
		System.out.println(obj.min2(10, -15));
		System.out.println(obj.min2(-10, -15));
		System.out.println(obj.min2(Integer.MIN_VALUE , Integer.MAX_VALUE));
		
		//Max
		System.out.println(obj.max2(10, 15));
		System.out.println(obj.max2(-10, 15));
		System.out.println(obj.max2(10, -15));
		System.out.println(obj.max2(-10, -15));
		System.out.println(obj.max2(Integer.MIN_VALUE , Integer.MAX_VALUE));
	}

}
