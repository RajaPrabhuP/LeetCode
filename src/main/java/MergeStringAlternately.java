
public class MergeStringAlternately {

	/*
	 *Pseudi code 
	 *start and end value always starts with 0
	 *break point is start and end is less then respectve words
	 *create emptty string
	 *
	 *if condition both
	 * 
	 * 
	 * */
	
	public static void MergeStringAlternatelyP(String word1, String word2) {
		
		int start = 0, end = 0;
		String res = "";
		
		while(start < word1.length() || end < word2.length()  ) {
			
			if(start < word1.length()  ) {
				res = res + String.valueOf(word1.charAt(start));
				start++;
			}
			if(end < word2.length()  ) {
				res = res + String.valueOf(word2.charAt(end));
				end++;
			}
		}
			
		System.out.println(res);
		
		}
		

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MergeStringAlternatelyP("aaa","bb");
		MergeStringAlternatelyP("","bbfbsbntgnhjsjsr");
		
	}

}
