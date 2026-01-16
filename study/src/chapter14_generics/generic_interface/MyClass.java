package chapter14_generics.generic_interface;


public class MyClass<T extends Comparable<T>> implements MinMax<T> {
	T[] vals;
	
	public MyClass(T[] o) {
		vals=o;
	}
	
	//Return minimum value in vals
	
	@Override
	public T min() {
		T min=vals[0];
		for(int i=0; i<vals.length;i++) {
			if(vals[i].compareTo(min)<0) {
				min=vals[i];
			}
		}
		return min;
	}
	
	//Return minimum value in vals
	@Override
	public T max() {
		T max=vals[0];
		for(int i=0;i<vals.length;i++) {
			if (vals[i].compareTo(max)>0) {
				max=vals[i];
			}
		}
		return max;
	}
}
