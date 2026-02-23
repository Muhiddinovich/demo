package chapter14_lambda_expressions.constructor_reference.with_generics;

public class ConstructorRefDemo2 {
	public static void main(String[] args) {
		MyFunc<Integer> myClassCons = MyClass<Integer>::new;

		MyClass<Integer> obj1 = myClassCons.func(100);
		System.out.println(obj1.getVal());
	}

}
