package slidingWindow;

import java.util.HashSet;

public class P011_SubStringNorepeatedchar {
	
	public static int substringChar(String str, int k) {
		if(str.length() < k)
			return 0;
		int counter = 0;
				HashSet<Character> hset = new HashSet<>();
				for(int i = 0; i < 3; i++)
					hset.add(str.charAt(i));

				if(hset.size() == 3)
					counter++;
				int right = 0;
				int len = k;
				while(k < str.length()){
					hset.add(str.charAt(k));
					hset.remove(str.charAt(right++));
					if(hset.size() == 3) counter++;
					k++;
				}

				return counter;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(substringChar("aababcabc", 3));
		System.out.println(substringChar("aababcabc", 3));
	}

}
