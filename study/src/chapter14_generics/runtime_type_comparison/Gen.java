package chapter14_generics.runtime_type_comparison;

public class Gen <T>{
	T ob;
	public Gen(T o) {
		ob=o;
	}
	
	T getOb() {
		return ob;
	}
}
