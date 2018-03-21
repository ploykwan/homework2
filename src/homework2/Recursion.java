package homework2;

import java.util.ArrayList;
import java.util.List;

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

	}
}
