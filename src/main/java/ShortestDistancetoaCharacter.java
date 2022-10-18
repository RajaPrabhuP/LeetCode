import java.util.Arrays;

public class ShortestDistancetoaCharacter {

	/*Given a string s and a character c that occurs in s, return an array of integers 
	 * 
	 * answer where answer.length == s.length and answer[i] is the distance from index i
	 *  to the closest occurrence of character c in s.

The distance between two indices i and j is abs(i - j), where abs is the absolute value function.
	+ve --> [l o v e l e e t c o d e] val e
	edge -> [a a a a] a [0,0,0,0]
	-ve -->
	
	Pseudo Code:
	1. String should convert into char array
	2. two variable start and end should start with 0
	3. using while loop breaking condition is start and end both are must be less the arr.length
	4. condition 1:
		if both start end have the same index and same character means
			arr[atart] = j-i;
			start++;
			end++;
		if arr[end]not equal to search chear
			inrement ++
		if arr[end] equalto char
			arr[atrt] = end - start;
			start++;			
 */
	
	public static void ShortestDistancetoaCharacterTwoPointer(String str, char c) {
		
		char[] charArray = str.toCharArray();
		int[] resultArr = new int[str.length()];
		int start = 0, end = 0;
		
		while(start < str.length() && end < str.length()) {
			
			if(charArray[start] == c && charArray[end] == c ) {
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
