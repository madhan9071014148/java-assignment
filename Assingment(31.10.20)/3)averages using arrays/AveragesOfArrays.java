package averagesofarrays;

public class AveragesOfArrays {

	public static void main(String[] args) {
		int[] arr= {20,30,25,35,-16,60,-100};
		int total=0;
		int average=0;
		for(int i=0; i<arr.length; i++) {
			total=total+arr[i];
		}
		average=total/arr.length;
		System.out.println(total);
		System.out.println("The average is:"+average);
		

	}

}
