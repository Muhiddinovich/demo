package chapter14_generics.simple_sample;

public class GenDemo {
	public static void main(String[] args) {
		Gen<Integer> iOb;
		iOb=new Gen<Integer>(88);
		iOb.showType();
		int v=iOb.getOb();
		System.out.println("value: "+v);
		System.out.println();
		
		Gen<String> strObjectGen = new Gen<String>("Generic Test");
		strObjectGen.showType();
		String string=strObjectGen.getOb();
		System.out.println("value: "+string);
		
	}

}
