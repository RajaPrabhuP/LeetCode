import java.util.Arrays;

public class P016_ShortestDistancetoaCharacter_821 {

	/*Given a string s and a character c that occurs in s, return an array of integers 
	 * 
	 * answer where answer.length == s.length and answer[i] is the distance from index i
	 *  to the closest occurrence of character c in s.
	
	https://leetcode.com/problems/shortest-distance-to-a-character/
		
	
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
	
	
public static void ShortestDistancetoaCharacterTwoPointerExpandFromCenter(String str, char c) {
		
		char[] charArray = str.toCharArray();
		int[] resultArr = new int[str.length()];
		int center = 0, left = center - 1, right = center + 1;
		
		while(center < charArray.length) {
			
			if(charArray[center] == c) {
				resultArr[center] = 0;
				center++;right++;left++;
			}else if(left >= 0) {
				if(charArray[left] == c) {
					resultArr[center] = Math.abs(center - left);
					center++;
					left = center - 1;
					right = center + 1;
				}else {
					left--;
				}
			}else if(right < charArray.length ) {
				if(charArray[right] == c) {
					resultArr[center] = Math.abs(right - center);
					center++;
					left = center - 1;
					right = center + 1;
				}else {
					right++;
				}
			}
		}
		
		System.out.println(Arrays.toString(resultArr));
		
	}

/**/
public int[] shortestToChar(String s, char c) {
    
	int[] result = new int[s.length()];
	char[] chArr = s.toCharArray();
	
	int left = 0, right = 0;
	int len = chArr.length;
	for(int i = 0; i < len; i++ ){
		left = i - 1;
		right = i + 1;
	while(left >= 0 || right < len){
		
		if(chArr[i] == c){
			result[i] = 0;
			break;
		}
		if(left >= 0){
			if(chArr[left] == c){
				result[i] = Math.abs(i - left);
				break;
			}else{
				left--;
			}
		}
		if(right < len){
			if(chArr[right] == c){
				result[i] = Math.abs(right - i);
				break;
			}else{
				right++;
			}
		}
		//System.out.println(Arrays.toString(result));
	}
	
	}
	return result;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//ShortestDistancetoaCharacterTwoPointer("loveleecode", 'e');
		//ShortestDistancetoaCharacterTwoPointer("abcadefa", 'a');
		//ShortestDistancetoaCharacterTwoPointer("aaaaa", 'a');
		
		ShortestDistancetoaCharacterTwoPointerExpandFromCenter("abcababac", 'c');
		ShortestDistancetoaCharacterTwoPointerExpandFromCenter("loveleetcode", 'e');
	}

}
