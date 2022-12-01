package SelfAssesement;

public class P004_CharOccurence {
	
	public static String charOccurence(String str) {
		if(str.length() == 0)
			return "";
		int left = 0, right = 0;
		char[] chArr = str.toCharArray();
		String result = "";
		while(right < str.length()){
			
			if(chArr[left] != chArr[right]){
				int val = right - left;
				result = result + chArr[left] + String.valueOf(val);
				left = right;
			}else
				right++;
			if(right == str.length() - 1) {
				int val = right - left + 1;
				result = result + chArr[left] + String.valueOf(val);
				left = right;
			}
		}
		return result;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(charOccurence("aabbccffdd"));
	}

}
