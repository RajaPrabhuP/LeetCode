package BinarySearch;

public class P001_BinarySearch {
	
	public static int findIndex(int[] arr, int val){
		int left = 0, right = arr.length - 1;
		int mid = 0;
		while(left < right){
			mid = (left + right) / 2;
			System.out.println(mid);
			if(arr[mid] == val ) {
				return mid;
			}
			else if( val > arr[mid] ) {
				left = mid + 1;
				System.out.println(left);
			}
			else{
				right = mid - 1;
				System.out.println(right);
			}
		}

		return -1;
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println(findIndex(new int[] {1,2,3,4,5,6}, 3));
		System.out.println(findIndex(new int[] {-1,0,3,5,9,12}, 9));
		
			
	}

}
