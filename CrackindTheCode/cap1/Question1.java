package cap1;

import java.util.HashSet;

public class Question1 {
	/* 
	 * returns true if the string has all unique characters and
	 * false otherwise
	 */
	public boolean hasAllUniqueChar(String str){
		HashSet<Character> set = new HashSet<Character>();
		for(int i=0;i<str.length();i++){
			if(!set.add(str.charAt(i))) return false;
		}
		return true;
	}
	/*
	 * The same question but now without using additional structures
	 */
	public boolean hasAllUniqueChar2(String str){
		for(int i=0;i<str.length();i++){
			for(int j=1;j<str.length();j++)
				if(str.charAt(i) ==str.charAt(j)) return false;
		}
		return true;
	}
}
