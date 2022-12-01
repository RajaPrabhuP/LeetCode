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
	
	 public static int[] shortestdistanceOfchar(String s, char c){
		  char[] strtoChar = s.toCharArray();
		  int[] result = new int[strtoChar.length];
			int left = 0, right = 0;
			for(int i = 0; i < strtoChar.length; i++){
				right = i + 1;
				left = i - 1; 
				
				while(left >= 0 || right <= strtoChar.length){
					if(strtoChar[i] == c){
						result[i] = 0;
						break;
					}else if(left >= 0 && strtoChar[left] == c) {
						result[i] = Math.abs(left - i);
						break;
					}
					else if(right <= strtoChar.length - 1 && strtoChar[right] == c) {
						result[i] = Math.abs(right - i);
						break;
					}
					
					left--;
					right++;
				}
			}
			System.out.println(Arrays.toString(result));
			return result; 
	  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//ShortestDistancetoaCharacterTwoPointer("loveleetcode", 'e');
		//ShortestDistancetoaCharacterTwoPointer("abcadefa", 'a');
		//ShortestDistancetoaCharacterTwoPointer("aaaaa", 'a');
		shortestdistanceOfchar("loveleetcode", 'e');
	}

}
