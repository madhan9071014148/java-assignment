package assignment.two;
import java.util.*;

public class ForEachMethod{
	public static void main(String[] args) {
		List<Integer> set =new LinkedList<Integer>();
		set.add(15);
		set.add(65);
		set.add(74);
		set.add(65);
		set.add(6);
		Collections.sort(set);
	set.forEach(itr->System.out.print(itr+" "));
	}

}
