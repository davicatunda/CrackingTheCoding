package cap01;

import java.util.HashMap;
import java.util.Map;

public class Question3 {
	/*
	 * Checks a string is a permutation of another.
	 * This method uses a int[] to count how many times
	 * each letter appeared in the str1 minus how many times
	 * each letter appeared in the str2.
	 */
	public boolean isPermutation(String str1, String str2){
		//check if the 2 Strings have the same length
		if(str1.length()!=str2.length()) return false;

		int[] char_set = new int[128];

		for(int i=0; i<str1.length(); i++){
			char_set[(int) str1.charAt(i)]++;
			char_set[(int) str2.charAt(i)]--;
		}
		
		//checks if all counters in char_set[] are 0
		for (int a: char_set)
			if(a!=0) return false;
		return true;
	}
	/*
	 * This method uses HashMap to check if a String is 
	 * permutation of another
	 */
	public boolean isPermutation2(String str1, String str2){
		int lenght=str1.length();
		
		//check if the 2 Strings have the same length
		if(lenght!=str2.length()) return false;
		
		Map<Character, Integer> map1 = new HashMap<Character, Integer>();
		Map<Character, Integer> map2 = new HashMap<Character, Integer>();
		
		for(int i=0;i<lenght;i++){
			Character c1=str1.charAt(i), c2=str2.charAt(i);
			if(map1.containsKey(c1)) map1.put(c1, map1.get(c1)+1);
			else map1.put(c1, 1);
			
			if(map2.containsKey(c2)) map2.put(c2, map2.get(c2)+1);
			else map2.put(c2,1);
			
		}
		return map1.equals(map2);
	}
}
