/**
 * This class is used to select some bits from
 *  number A and some from B.
 * 
 * Method 1: here we are masking A and B both for 
 * 			 selected positions and then combine
 * 			 both A and B.
 * 
 * 
 * Method 2:
 * 	a. XOR of A and mask will select all the bits from A
 * 	 	where mask has 0.
 *  b. we mask the mask using XOR of A and B(which convert all the 1's 
 *  	to 0 in mask which same bit in A and B)
 *  c. XOR the A and mask to get final result.
 * 
 * 
 */
package com.github;

public class MergeBitsFromTwoNumber {

	//picks bit from A where mask has 0
	//picks bit from B where mask has 1
	public int mergeNaive(int A, int B, int mask) {
		A = A & ~mask;
		B = B & mask;
		return A | B;
	}
	
	public int mergeEfficient(int A, int B, int mask) {
		return A ^ ((A ^ B) & mask);
	}
	
	public static void main(String[] args) {

		MergeBitsFromTwoNumber obj = new MergeBitsFromTwoNumber();
		//0000 1100
		int mask = 12;
		
		System.out.println("mergeNaive(3, 12, mask) is : " + obj.mergeNaive(3, 12, mask));
		System.out.println("mergeNaive(-1, 0, mask) is : " + obj.mergeNaive(-1, 0, mask));
		
		System.out.println("mergeEfficient(3, 12, mask) is : " + obj.mergeEfficient(3, 12, mask));
		System.out.println("mergeEfficient(-1, 0, mask) is : " + obj.mergeEfficient(-1, 0, mask));
	}

}
