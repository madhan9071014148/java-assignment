package assignment.two;

import java.util.*;

public class ArrayClassUsingForEach {
		public static void main(String[] args) {
			String [] a= {"madhan","rakshith","abhi","aravind","Mani"};
			List<String> list=Arrays.asList(a);
			Collections.sort(list);
			list.forEach(arr->System.out.println(arr));
		}

}
