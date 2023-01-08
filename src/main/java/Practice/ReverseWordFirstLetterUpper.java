package Practice;

public class ReverseWordFirstLetterUpper {

	/*Create Result String buufeer
	 * split the string using delim space
	 * iterate each word and reverse and convert first character into uppercase and return.
	 * append the each word to reslt
	 * */
	
	public static String eachWord(String str) {
		
		char[] chArr = str.toCharArray();
		int start = 0, end = chArr.length - 1;
		char temp;
		while(start < end) {
			temp = chArr[start];
			chArr[start++] = chArr[end];
			chArr[end--] = temp;
		}
		
		chArr[0] = Character.toUpperCase(chArr[0]);
		for(int i = 1; i < str.length(); i++)
			chArr[i] = Character.toLowerCase(chArr[i]);
		return String.valueOf(chArr);
		
	}
	
	public static String reverseWord(String str) {
		
		String[] strSplit = str.split(" ");
		StringBuffer result = new StringBuffer();
		for(int i = 0; i < strSplit.length; i++) {
			result.append(eachWord(strSplit[i])).append(" ");
		}
		System.out.println(result);
		return result.toString().trim();
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		reverseWord("My Name is Raja Prabhu");
	}

}
