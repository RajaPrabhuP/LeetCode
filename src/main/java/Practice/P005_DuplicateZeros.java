package Practice;

import java.util.Arrays;

public class P005_DuplicateZeros {

	/*https://leetcode.com/problems/duplicate-zeros/*/
	public static void duplicateZeros(int[] arr) {
		
		int[] outPut = new int[arr.length];
		int p1 = 0, p2 = 0;
		while(p2 < outPut.length) {
			
			if(arr[p1] == 0) {
				p2++;
				p2++;
				p1++;
			}else {
				outPut[p2] = arr[p1];
				p1++;
				p2++;	
			}
		}
		
		//System.out.println(Arrays.toString(outPut)); 
    }
        
	public static void main(String[] args) {
	
		duplicateZeros(new int[] {1,0,2,3,0,4,5,0});

	}

}
