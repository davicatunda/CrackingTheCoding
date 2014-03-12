package cap1;

public class Question5 {
	public String compressor(String str){

		StringBuffer compressedStr = new StringBuffer ();

		for (int i=0, letterCount=0; i<str.length();i++){
			if(str.charAt(i)!=str.charAt(i+1)){
				compressedStr.append(str.charAt(i)+letterCount);
				letterCount = 0;
			} else{
				letterCount++;
			}
		}
		return (compressedStr.length() > str.length()) ? str : compressedStr.toString();
	}


}
