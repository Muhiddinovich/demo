package chapter14_generics.generic_subclass;

public class HierDemo2 {
	public static void main(String[] args) {
		GenericSubclass<String> w = new GenericSubclass<String>("Hello", 47);
		System.out.println(w.getOb()+"  "+ w.getNum());
	}
	

}
