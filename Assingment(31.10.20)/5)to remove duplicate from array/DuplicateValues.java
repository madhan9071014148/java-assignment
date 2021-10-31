package duplicatevalues;

import java.util.Arrays;

public class DuplicateValues {

	public static void main(String[] args) {
		int temp=0;
		int[] arr= {1,2,3,4,1,2,};
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]);
		}
		System.out.println(Arrays.copyOf(arr, temp));

	}

}
