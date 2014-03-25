package interviewedQuestions;

import java.util.HashMap;

public class Methods {
	public static boolean isPermutation(String a, String b){
		
		if(a.length()!=b.length())return false;
		int n = a.length();
		
		HashMap<Character, Integer> m = new HashMap<Character, Integer>();
		char c;
		
		for(int i = 0; i < n;i++){
			c = a.charAt(i);
			if(!m.containsKey(c)) m.put(c, 1);
			else m.put(c, m.get(c)+1);
		}
		
		for(int i = 0; i < n;i++){
			c = b.charAt(i);
			if(!m.containsKey(c)) return false;
			else if (m.get(c)==0) return false;
			else m.put(c, m.get(c)-1);
		}
		
		for(int v : m.values()){
			if(v!=0) return false;
		}
		
		return true;
	}
	
	

}
