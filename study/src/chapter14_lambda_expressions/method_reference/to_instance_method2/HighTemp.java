package chapter14_lambda_expressions.method_reference.to_instance_method2;


//Class that stores the temperature high for a day
public class HighTemp {
	private int hTemp;
	
	public HighTemp(int ht) {
		hTemp=ht;
	}
	
	boolean sameTemp(HighTemp ht2) {
		return hTemp==ht2.hTemp;
	}
	
	boolean lessThanTemp(HighTemp ht2) {
		return hTemp< ht2.hTemp;
	}
	
}
