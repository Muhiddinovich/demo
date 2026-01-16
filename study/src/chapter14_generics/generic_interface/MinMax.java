package chapter14_generics.generic_interface;

public interface MinMax <T extends Comparable<T>>{
	T min();
	T max();
}
