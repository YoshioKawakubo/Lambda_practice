package function;

import java.util.ArrayList;
import java.util.List;

public class ForeachEx {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		//要素全出力
		list.forEach((num) -> {System.out.println(num);});
		System.out.println("------------------------");
		//特定の要素を出力
		list.forEach((num) -> {if(num % 2 == 0) System.out.println(num);});
		System.out.println("------------------------");
		
		List<String> names = new ArrayList<>();
		names.add("yoshio");
		names.add("michael");
		names.add("james");
		names.add("ryo");
		names.add("kawakubo");
		//要素に対して何かしらの操作を加える
		names.forEach(name -> System.out.println(name.toUpperCase()));
	}

}
