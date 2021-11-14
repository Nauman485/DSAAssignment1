package geekster;

public class Target_is_sum_of_ele {
	public static void main(String []args) {
	int arr[]= {2,7,11,15};
	int target=9;
	index_of_ele(arr, target);
	}
	
	static void index_of_ele(int []arr, int target) {
		for(int i=0; i<arr.length; i++) {
			for(int j=1; j<arr.length; j++) {
				if(arr[i]+arr[j]==target) {
					System.out.println(i+" "+j);
				}
			}
		}
	}

}
