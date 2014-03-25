package interviewedQuestions;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class DictionaryIter {
	private String []dict;
	private HashMap<String, HashSet<String> > anagrams;
	
	public DictionaryIter(){
		anagrams = new HashMap<String, HashSet<String> >();
		
	}
	private String sortWord(String word){        
		char[] chars = word.toCharArray();
		Arrays.sort(chars);
		String sorted = new String(chars);
		return sorted;
	}
	
	public void buildMap(){
		for(int i=0;i<dict.length;i++){
			//get word
			String word = dict[i];
			//create signature
			String sortedWord = sortWord(word);
			//Current HashSet
			HashSet<String> current;
			
			//looking and initializing HashSet 
			if(anagrams.containsKey(sortedWord)){
				current = anagrams.get(sortedWord);
			}else{
				current = new HashSet<String>();
				anagrams.put(sortedWord, current);
			}
			//adding word to the set.
			current.add(word);
		}
	}
	
	public HashSet<String> getAnagrams(String word){
		return anagrams.get(sortWord(word));
	}

}
