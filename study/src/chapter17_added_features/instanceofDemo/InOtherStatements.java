package chapter17_added_features.instanceofDemo;

public class InOtherStatements {
	public static void main(String[] args) {
		Object [] somObjects = {
				new String("Alpha"),
				new String("Beta"),
				new String("Omega"),
				Integer.valueOf(10)
		};
		
		for(int i=0; (somObjects[i] instanceof String str) &&(i<somObjects.length); i++) { // choosing only strings
			System.out.println("Processing "+str);
		}
	}
}
