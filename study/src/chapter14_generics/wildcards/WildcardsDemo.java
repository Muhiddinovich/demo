package chapter14_generics.wildcards;

public class WildcardsDemo {
	public static void main(String[] args) {
		Integer[] integers = { 1, 2, 3, 4, 5 };
		Stats<Integer> integerStat=new Stats<Integer>(integers);
		System.out.println("Integer stats average: "+ integerStat.average());
		
		Double[] doubles = { 1.1, 2.2, 3.3, 4.4, 5.5 };
		Stats<Double> doubleStats=new Stats<Double>(doubles);
		System.out.println("Double stats average: "+doubleStats.average());
		
		Float[] floats = { 1.0f, 2.0f, 3.0f, 4.0f, 5.0f };
		Stats<Float> floatStats=new Stats<Float>(floats);
		System.out.println("Float stat average: "+floatStats.average());
		
		if (integerStat.isAverageSame(doubleStats)) {
			System.out.println("True");
		}
		else {
			System.out.println("False");
		}
		
		if(integerStat.isAverageSame(floatStats))
			System.out.println("True");
		else
			System.out.println("false");

	}

}
