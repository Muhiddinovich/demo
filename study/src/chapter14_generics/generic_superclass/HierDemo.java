package chapter14_generics.generic_superclass;

public class HierDemo {
	public static void main(String[] args) {
		
		Gen3<String, Integer> x=new Gen3<String, Integer>("The value is" , 99);
		System.out.println(x.getOb());
		System.out.println(x.getOb2());
	}
}
