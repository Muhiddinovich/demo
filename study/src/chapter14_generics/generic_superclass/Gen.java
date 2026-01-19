package chapter14_generics.generic_superclass;

public class Gen <T>{
	T ob;
	public Gen(T o) {
		ob=o;
	}
	
	T getOb() {
		return ob;
	}
}
