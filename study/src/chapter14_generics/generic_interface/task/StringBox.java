package chapter14_generics.generic_interface.task;

public class StringBox<T> implements Box<T> {
	T objectT;
		
	@Override
	public void set(T value) {
		objectT=value;
	}
	
	@Override
	public T get() {
		return objectT;
	}

	public static void main(String[] args) {
		StringBox<String>strOb = new StringBox<String>();
		strOb.set("This is a value");
		System.out.println("The value is: "+strOb.get());
	}
}
