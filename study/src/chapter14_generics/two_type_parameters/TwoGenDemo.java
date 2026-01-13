package chapter14_generics.two_type_parameters;

public class TwoGenDemo {

	public static void main(String[] args) {
		TwoGen<Integer, String> twoGen=new TwoGen<Integer, String>(88, "Generics");
		
		twoGen.showTypes();
		
		int v=twoGen.getObT();
		String str=twoGen.getObV();
		
		System.out.println(v);
		System.out.println(str);
	}

}
