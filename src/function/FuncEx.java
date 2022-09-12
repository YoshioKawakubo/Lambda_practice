package function;

import java.util.function.Function;

public class FuncEx {
	public static void main(String[] args) {
		Function<Integer, Integer> fun = i -> i * 5;
		System.out.println(fun.apply(5));
		
		Function<String, Integer> fun2 = str -> Integer.parseInt(str);
		System.out.println(fun2.apply("12345"));
	}

}
