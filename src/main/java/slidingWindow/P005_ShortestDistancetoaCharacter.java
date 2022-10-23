package slidingWindow;
import java.util.ArrayList;
import java.util.Arrays;

public class P005_ShortestDistancetoaCharacter {

	
	
	public static void ShortestDistancetoaCharacterTwoPointer(String str, char c) {
		
		char[] charArray = str.toCharArray();
		
		ArrayList<Character> aList = new ArrayList<Character>(); 
		
		for(int i = 0; i < charArray.length; i++) {
			aList.add(charArray[i]);
		}
		
		int[] resultArr = new int[str.length()];
		int start = 0, end = 0;
		
		while(start < str.length() && end < str.length()) {
			
			if(charArray[start] == c && charArray[end] == c ) {
				resultArr[start] = Math.abs(end - start);
				start++;
				end++;	
				continue;
			}
			if(aList.get(start) == c && aList.get(end) == c ) {
				resultArr[start] = Math.abs(end - start);
				start++;
				end++;	
				continue;
			}
			if(charArray[end] != c) {
				end++;
				continue;
			}
			if(charArray[end] == c) {
				resultArr[start] = Math.abs(end - start);
				start++;
				continue;
			}
			
		}
		
		System.out.println(Arrays.toString(resultArr));
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ShortestDistancetoaCharacterTwoPointer("loveleetcode", 'e');
		//ShortestDistancetoaCharacterTwoPointer("abcadefa", 'a');
		//ShortestDistancetoaCharacterTwoPointer("aaaaa", 'a');
	}

}
