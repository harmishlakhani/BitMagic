/**
 * This class is used to set or clear the bits for any particular position.
 * 
 * SET:
 * 23     = 0001 0111
 * mask   = 0000 1000 (1 << 3)
 * --------------------------
 * 23 | mask
 * result = 0001 1111(31)
 * 
 * CLEAR:
 * 10     = 0000 1010
 * mask   = 0000 1000 (1 << 3)
 * ~mask  = 1111 0111
 * --------------------------
 * 10 & ~mask
 * result = 0000 0010(2)
 * 
 * In single line:
 * 
 * w = number
 * m = mask
 * if f == 0 -> AND
 * else 	 -> OR
 * 
 * w ^= (-f ^ w) & m;
 * w = (w & ~m) | (-f & m);
 */
package com.github;

public class SetOrClearBits {

	public int set(int number, int position) {
		return number | 1 << (position - 1);
	}
	
	public int clear(int number, int position) {
		return number & ~(1 << (position - 1));
	}
	
	//Using single function it clear/set bit
	public int setOrClear1(int number, int position, int flag) {
		return number ^ (-flag  ^ number) & (1 << (position - 1));
	}
	
	//Using single function it clear/set bit	
	public int setOrClear2(int number, int position, int flag) {
		int mask = 1 << (position - 1);
		return (number & ~mask) | (-flag & mask);
	}
	
	public static void main(String[] args) {

		SetOrClearBits obj = new SetOrClearBits();
		
		System.out.println("set(23, 4) is : " + obj.set(23, 4));
		System.out.println("clear(10, 4) is : " + obj.clear(10, 4));
		
		System.out.println("set(23, 4) is : " + obj.setOrClear1(23, 4, 1));
		System.out.println("clear(10, 4) is : " + obj.setOrClear1(10, 4, 0));
		
		System.out.println("set(23, 4) is : " + obj.setOrClear2(23, 4, 1));
		System.out.println("clear(10, 4) is : " + obj.setOrClear2(10, 4, 0));
	}

}
