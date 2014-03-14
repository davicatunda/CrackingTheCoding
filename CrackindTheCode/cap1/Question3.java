package cap1;

public class Question3 {
	//this method checks a string is a permutation of another.
	public boolean isPermutation(String str1, String str2){
		if(str1.length()!=str2.length()) return false;

		int[] char_set = new int[256];

		for(int i=0; i<str1.length(); i++){
			char_set[(int) str1.charAt(i)]++;
			char_set[(int) str2.charAt(i)]--;
		}

		for (int a: char_set)
			if(a!=0) return false;
		return true;
	}
}
