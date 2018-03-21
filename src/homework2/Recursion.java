package homework2;

import java.util.ArrayList;
import java.util.List;

public class Recursion {
	/**
	 * Remove duplicate consecutive items from a list, changing the list parameter.
	 * For example, if list = { a, b, b, b, c, b, c, c} then after calling unique the list
	 * will contain {a, b, c, b, c}. Only consecutive duplicates are removed.
	 * Objects are compared using their own equals method.
	 * @param list of any kind of object. The elements are not null.
	 * @return reference to the list parameter with consecutive duplicates removed.
	 */
	public static List<String> unique(List<String> list){
		if( list.size() == 1 ) return list;
		if( list.get(0).equals(list.get(1))) {
			//System.out.println(list.get(0) +" "+list.get(1));
			return unique(list.subList(1,list.size()));
		}
		List<String> alpha = list.subList(0,1);
		alpha.addAll(unique(list.subList(1,list.size())));
		return alpha;
	}
	
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("a");
		list.add("b");
		list.add("b");
		list.add("b");
		list.add("c");
		list.add("b");
		list.add("c");
		list.add("c");
		//for(Object o: list) System.out.print(o+", "); //a, b, b, b, c, b, c, c, 
		//System.out.println();
		System.out.println(unique(list));
		//for(Object o: list) System.out.print(o+", ");  
		
	}
}
