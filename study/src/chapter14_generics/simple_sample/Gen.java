package chapter14_generics.simple_sample;

public class Gen <T>{
	T ob;
	public Gen(T o) {
		ob=o;
	}
	
	T getOb() {
		return ob;
	}
	
	void showType() {
		System.out.println("Type of T "+ob.getClass().getName());
	}
}
