package geekster;

public class Frequency_of_ele {
	
	public static void main(String []args) {
		int []arr= {1,1,2,2,4,5,5,6,6,6,6,9,10,11};
		int target=6;
		frequency(arr,target);
	}
	static void frequency(int arr[], int target) {
		int count=0;
		for(int i=0; i<arr.length; i++) {
			if(target==arr[i]) {
				count++;
			}
		}
		System.out.println(count);
	}

}
