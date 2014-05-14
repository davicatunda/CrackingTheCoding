package utils;

public class BitOperation {
	
	//get the ith bit
	public static boolean getBit(int num, int i){
		return (((1 << i) & num) != 0 );
	}
	//set the ith bit to 1
	public static int setBit(int num, int i){
		return ((1<<i) | num);
	}
	// clear the ith bit and leave the remainder unchanged
	public static int clearBit(int num, int i){
		return (~(1<<i) & num);
	}
	//To clear all bits from the most significant bit through i (inclusive) 10101010[1010] & 0000000[1111]
	public static int clearBitsMSBthroughI(int num, int i){
		return ((1 << i) - 1) & num;
	}
	//To clear all bits from i through 0 (inclusive)
	public static int clearBitsIthrough0(int num, int i){
		return (~((1 << (i+1)) - 1) & num);
	}
	public static int updateBit(int num, int i, int v){
		return clearBit(num, i) | (v<<i) ;
	}
}
