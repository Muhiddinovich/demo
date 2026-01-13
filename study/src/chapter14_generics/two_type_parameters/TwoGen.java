package chapter14_generics.two_type_parameters;

public class TwoGen <T,V> {
	T obT;
	V obV;
	
	public TwoGen(T t, V v) {
		obT=t;
		obV=v;
	}
	
	void showTypes() {
		System.out.println("Type of T is: "+ obT.getClass().getName());
		System.out.println("Type of V is: "+ obV.getClass().getName());
	}
	
	T getObT() {
		return obT;
	}
	
	V getObV() {
		return obV;
	}
}

