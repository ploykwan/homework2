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
		if( list.get(0) == list.get(1)) {
			//System.out.println(list.get(0) +" "+list.get(1));
			return unique(list.subList(1,list.size()));
		}
		List<String> alpha = new ArrayList<String>();
		alpha.add(list.get(0));
		alpha.addAll(unique(list.subList(1,list.size())));
		return alpha;
	}
	
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
//		list.add("a");
//		list.add("b");
//		list.add("c");
//		list.add("d");
//		list.add("e");
//		System.out.println(list.size());
//		List sub = list.subList(1, 4);
//		// sub contains {"b", "c", "d"}
//		sub.get(0); // returns "b"
//		sub.get(1); // returns "c"
//		sub.set(2, "hahaha"); // change element 2 to "hahaha"
//		System.out.println(sub.size());
//		sub.remove(1);// remove element #1 ("c")
//		// print the original List. You'll see that subList changed it
//		for(Object o: sub) System.out.print(o+", ");
//		System.out.println(sub.size()+ " "+list.size());
//		for(Object o: list) System.out.print(o+", ");
//		// output: a, b, hahaha, e
//		System.out.println();

		
		list.clear(); //list = { a, b, b, b, c, b, c, c}
		list.add("a");
		list.add("b");
		list.add("b");
		list.add("b");
		list.add("c");
		list.add("b");
		list.add("c");
		list.add("c");
		//for(Object o: list) System.out.print(o+", "); //a, a, c, d, e, 
		//System.out.println();
		System.out.println(unique(list));
		//for(Object o: list) System.out.print(o+", "); //a, a, c, d, e, 
		
	}
}
