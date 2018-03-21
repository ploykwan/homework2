package homework2;

import java.util.ArrayList;
import java.util.List;
/**
 * Homework2 for OOP2 class.
 * @author kwankaew
 *
 */
public class Recursion {
	/**
	 * Remove duplicate consecutive items from a list, changing the list parameter.
	 * For example, if list = { a, b, b, b, c, b, c, c} then after calling unique
	 * the list will contain {a, b, c, b, c}. Only consecutive duplicates are
	 * removed. Objects are compared using their own equals method.
	 * 
	 * @param list
	 *            of any kind of object. The elements are not null.
	 * @return reference to the list parameter with consecutive duplicates removed.
	 */
	public static List<?> unique(List<?> list) {
		if (list.size() == 1)
			return list;
		List<?> line = list.subList(1, list.size());
		if (list.get(0).equals(list.get(1))) {
			line.remove(0);
			unique(list);
		} else
			unique(line);
		return list;
	}
	
	/**
	 * 
	 * @param n is the number that have to calculate.
	 * @return the fibonacci number of n.
	 */
	public static long fibonacci(int n) {
		return helper(n,0,1);
	}
	
	/**
	 * Helper method for fibonacci method.
	 * @param n is the number that have to calculate.
	 * @param num1 the first number in fibonacci sequence.
	 * @param num2 the secound number in fibonacci sequence.
	 * @return the fibonacci number.
	 */
	public static long helper(int n,long num1, long num2) {
		if( n == 0 ) {
			return 0;
		}
		if( n == 1 ) {
			return num2;
		}
		return helper(n-1,num2,num1+num2);
	}

	/**
	 * Main
	 * 
	 */
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
		System.out.println(list);
		System.out.println(unique(list));
		
		System.out.println(fibonacci(90));

	}
}
