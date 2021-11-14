package geekster;

public class find_index_of_target_BS {
	
	static int binary_search(int []arr,int target) {
		int low=0, high=arr.length-1;
		
		while(low<=high) {
			int mid=low+(high-low)/2;
			if(arr[mid]==target) {
				return mid;
			}
			else if(target<arr[mid]) {
				high=mid-1;
			}
			else {
				low=mid+1;
			}
		}
		return -1;
	}
	
	
	public static void main(String []args) {
		int arr[]= {2,4,6,8,10,11,13,14};
		int target=13;
		System.out.println(binary_search(arr,target));
	}


}
