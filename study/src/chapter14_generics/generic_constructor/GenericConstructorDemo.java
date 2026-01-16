package chapter14_generics.generic_constructor;

public class GenericConstructorDemo {
	public static void main(String[] args) {
		GenCons test = new GenCons(100);
		GenCons test2=new GenCons(123.5f);
		
		test.showVal();
		test2.showVal();
	}
}
