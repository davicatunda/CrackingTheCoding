package cap1;

import java.util.Random;

import utils.Queue;

public class Question8 {

	public boolean isRotation(String str1, String str2){
		int length1 = str1.length();
		int length2 = str2.length();
		
		if(length1!=length2)return false;
		
		if(str2.isSubstring(str1+str1)) return true; 
		
		return false;
	}
}



//abcdefg
//efgabcd