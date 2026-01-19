package chapter14_generics.generic_subclass;

public class GenericSubclass <T> extends NonGen {
	T ob;
	
	public GenericSubclass(T o, int num) {
		super(num);
		ob=o;
	}
	
	T getOb() {
		return ob;
	}
}
