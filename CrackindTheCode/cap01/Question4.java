package cap01;

public class Question4 {
	/*
	 * Otimizando o tempo.
	 */
	public String replaceSpaces( Character[] sentence, Integer n){
		StringBuffer str = new StringBuffer();
		
		for(int i=0; i<n; i++){
			if(sentence[i]==' ') str.append("%20");
			else str.append(sentence[i]);
		}
		return str.toString();
	}
	
	/*
	 * Otimizando a memória
	 */
	public Character[] replaceSpaces2(Character[] sentence, Integer n){
		int numberOfSpaces=0;
		for(int i=0;i<n;i++){
			if(sentence[i]==' ') numberOfSpaces+=2;
			numberOfSpaces++;
		}
		for(int j=n-1; j>=0; j++){
			if(sentence[j]==' '){
				sentence[j+numberOfSpaces*2-2] = '%';
				sentence[j+numberOfSpaces*2-1] = '2';
				sentence[j+numberOfSpaces*2] = '0';
				numberOfSpaces--;
			} else
			sentence[j+numberOfSpaces*2] = sentence[j];
		}
		return sentence;
	}
}
