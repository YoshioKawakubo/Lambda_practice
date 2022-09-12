package function;

import java.util.function.Predicate;

public class PreEx {
	
	public static void main(String[] args) {
		Predicate<String> pre = (p) -> {
			return p.equals("A");
		};
		System.out.println(pre.test("A"));
		System.out.println(pre.test("B"));
		
		Predicate<String> predicate = str -> str.isEmpty();
		System.out.println(predicate.test("abc"));
		System.out.println(predicate.test(""));
	}

}
