package chapter14_lambda_expressions.constructor_reference.more;

public class ConstructorRefDemo3 {
	static <R, T> R myClassFactory(MyFunc<R, T> cons, T v) {
		return cons.func(v);
	}

	public static void main(String[] args) {
		MyFunc<MyClass<Double>, Double> myClassConstructorObj = MyClass<Double>::new;
		MyClass<Double> mc = myClassFactory(myClassConstructorObj, 100.1);
		System.out.println(mc.getVal());

		MyFunc<MyClass2, String> myClassCons2 = MyClass2::new;
		MyClass2 mc2 = myClassFactory(myClassCons2, "Lambda");
		System.out.println(mc2.getStr());

	}
}
