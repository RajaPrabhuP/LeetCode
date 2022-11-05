package Practice;

public class P002_FirstUniqueCharacterinaString {
	
	//https://leetcode.com/problems/first-unique-character-in-a-string/description/
	
	public static int firstUniqChar(String s) {
		
		for(int i = 0; i < s.length(); i++) {
			
			if(s.indexOf(s.charAt(i)) == s.lastIndexOf(s.charAt(i))) {
				return i;
			}
		}
		
		return -1;
        
    }
	public static void main(String[] args) {
		
		System.out.println(firstUniqChar("leetcode"));
		System.out.println(firstUniqChar("aabb"));
		
	}

}
