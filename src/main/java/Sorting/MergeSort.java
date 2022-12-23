package Sorting;

public class MergeSort {

	public static void recursive(int[] arr, int left, int right) {
		
		if(left < right) {
			int mid = (left + right) / 2;
			System.out.println("FirstMethod  "+left+" "+mid);
			recursive(arr, left, mid);
			System.out.println("secondMethod  "+(mid+1)+" "+right);
			recursive(arr, mid + 1, right);
			System.out.println("Left -->"+left);
			System.out.println("Right -->"+right);
			System.out.println("Mid -->"+mid);
			merge( arr, left, mid, right );
		}
	}
	
	 public static void merge(int[] input, int start, int mid, int end){
	        int temp[] = new int[end-start+1];

	        int leftArrayIndex = start, rightArrayIndex = mid+1, tempArrayIndex = 0;

	        while( leftArrayIndex <= mid && rightArrayIndex <= end){
	            if(input[leftArrayIndex] < input[rightArrayIndex])
	                temp[tempArrayIndex++] = input[leftArrayIndex++];
	            else
	                temp[tempArrayIndex++] = input[rightArrayIndex++];
	        }

	        while(leftArrayIndex <= mid)
	            temp[tempArrayIndex++] = input[leftArrayIndex++];

	        while(rightArrayIndex <= end)
	            temp[tempArrayIndex++] = input[rightArrayIndex++];


	        for(int i =start; i<=end;i++){
	            input[i] = temp[i-start];
	        }
	    }
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		recursive(new int[] {1,2,3,4,5,6,7,8,9}, 0, 8);
	}

}
