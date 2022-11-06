package Practice;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class P004_NumberofEquivalentDominoPairs {
	
	public static int numEquivDominoPairs(int[][] dominoes) {
		int counter = 0;
		HashSet<Integer> firstSet = new HashSet<Integer>();
		HashSet<Integer> secondSet = new HashSet<Integer>();
		
		for(int i = 0; i < dominoes.length; i++) {
			int[] domino = dominoes[i];
			for(int arr : domino )
				firstSet.add(arr);
			for(int j = i + 1; j < dominoes.length; j++ ) {
				int[] dominoTwo = dominoes[j];
				for(int arr1 : dominoTwo )
					secondSet.add(arr1);
				if(firstSet.equals(secondSet))
					counter++;
				secondSet.clear();
			}
			firstSet.clear();
		}
		return counter;
        
    }
	
	public static void main(String[] args) {
		
		numEquivDominoPairs(new int[][] {{1, 0}, {0, 1}, {0, 1},{1, 1}});

	}

}
