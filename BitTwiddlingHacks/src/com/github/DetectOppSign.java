/**
 * This class is used to detect if two integers are opposite in sign or not.
 * 
 * Explanation : 
 * 		MSB of -ve number is 1 and +ve number is 0.
 * 		if we XOR both numbers then MSB of result is 0 if both are same
 * 													 1 if both are different.
 * 		MSB is 1 means that number is negative (number < 0 = true).
 */
package com.github;

public class DetectOppSign {

	public boolean detectOppositeSign(int A, int B) {
		return (A ^ B) < 0;
	}
	
	public static void main(String[] args) {

		DetectOppSign obj = new DetectOppSign();
		
		System.out.println(obj.detectOppositeSign(10, 5));
		System.out.println(obj.detectOppositeSign(-10, 5));
		System.out.println(obj.detectOppositeSign(10, -5));
		System.out.println(obj.detectOppositeSign(-10, -5));
	}

}
