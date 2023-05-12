package Practice;

public class P015_SumOfInteger {

	public static void sumNumberInString(String str) {
		int sum = 0;
		String number = "";
		for(int i = 0; i <str.trim().length(); i++) {
				char ch = str.charAt(i);
			if(Character.isDigit(ch)){
				number = number + ch;
				//System.out.println(number);
			}else {
				//System.out.println(number);
				sum = sum + Integer.parseInt(number.trim());
				number = "0";
			}
			if(i == str.length() -1 && Character.isDigit(ch))
				sum = sum + Integer.parseInt(number.trim());
		}
		System.err.println(sum);
	}
	
	public static void main(String[] args) {
		
		String str = "254abc568def7282";
		sumNumberInString(str);
		
		String str1 = "123abc1";
		sumNumberInString(str1);
		
		String str2 = " ";
		sumNumberInString(str2);
		
	}

}
