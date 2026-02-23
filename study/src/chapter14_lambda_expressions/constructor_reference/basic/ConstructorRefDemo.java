package chapter14_lambda_expressions.constructor_reference.basic;

public class ConstructorRefDemo {
	public static void main(String[] args) {
		MyFunc myClassConstructor = MyClass::new;
		// Create an instance of MyClass via that constructor reference.
		MyClass mc = myClassConstructor.func(100);
		// Use the instance of the MyClass just created
		System.out.println(mc.getVal());
	}
}
