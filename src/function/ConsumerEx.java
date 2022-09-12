package function;

import java.util.function.Consumer;

public class ConsumerEx {
	public static void main(String[] args) {
		//引数にジェネリクスで指定した型の戻り値を指定して結果を返す
		Consumer<Integer> con = (p) -> {
			System.out.println(p * 5);
		};
		con.accept(20);
	}

}
