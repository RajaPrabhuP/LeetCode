package Practice;

import java.util.Arrays;
import java.util.HashSet;

public class P016_SubString {

	
public static void subStringPalindrome(String str){
		
		char[] chArr = str.toCharArray();
		HashSet<String> hset = new HashSet<String>();
		for(int i = 0; i < str.length(); i++){
			
			int leftI = i - 1;
			int rightI = i + 1;
			
					
			while(leftI >= 0 || rightI < str.length()){
					
					if((leftI >= 0 && rightI < str.length()) && (str.charAt(leftI) == str.charAt(rightI)) ){
						leftI--;
						rightI++;
						}else{
							char[] copyOfRange = Arrays.copyOfRange(chArr,leftI+1,rightI);
							System.out.println(copyOfRange);
							hset.add(String.valueOf(copyOfRange));
							break;
						}
			}
			
		}
		System.out.println(hset);
		
		
	}
	public static void main(String[] args) {
		subStringPalindrome("aBBBcdMOMkajleDAD");
	}

}
