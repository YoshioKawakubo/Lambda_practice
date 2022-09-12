package function;

import java.util.function.Supplier;

public class SupplierEx {
	public static void main(String[] args) {
		//関数型インターフェースSupplierのラムダ式
		//ジェネリクスは指定しなくても可能
		Supplier<String> sup = () -> {
			String str = "Hello World!";
			return str;
		};
		System.out.println(sup.get());
	}

}
