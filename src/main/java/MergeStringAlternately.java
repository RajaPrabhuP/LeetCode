import java.util.Arrays;

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
	
	private static void mergeStrings(String w1, String w2) {
		char c1[] = w1.toCharArray();
		char c2[] = w2.toCharArray();
		
		char[] charArray = w1.toCharArray();
		
		System.out.println(Arrays.toString(charArray));
		
		char result[] = new char[c1.length + c2.length];
		String result1="";
		for (int i = 0; i<c1.length; i++) {
			c1[i] = result[i];
			System.out.println(Arrays.toString(c1));
			System.out.println(i);
			i++;

		}	
		
		 for(int j=0;j<=c2.length-1;j++)
		 {  c2[j]=result[j+1];
		  	j++;
		  	System.out.println(j);
		  }
		// System.out.println(String.join(result,""));
		 System.out.println(Arrays.toString(result));
		for(int k=0;k<=result.length-1;k++)
		{
			result1=result1+result[k];
		}
		System.out.println("Result" +result1);
		
		
	}
	
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
		//MergeStringAlternatelyP("aaa","bb");
		//MergeStringAlternatelyP("","bbfbsbntgnhjsjsr");
		mergeStrings("aaa","bb");
		
	}

}
