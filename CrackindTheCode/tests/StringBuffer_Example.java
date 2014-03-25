package tests;

public class StringBuffer_Example {

	public static String joinWords(String[] words) {
		StringBuffer sentence = new StringBuffer();
		for (String w : words) {
			sentence.append(w);
			}
		return sentence.toString();
 }
		 
	
	
	public static void main(String[] args) {
		String[] sentence = {"Esta", " é"," a", " frase", " de", " exemplo"};
		System.out.println(joinWords(sentence));
	}

}
