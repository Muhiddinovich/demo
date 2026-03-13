package chapter17_added_features.instanceofDemo;

public class Demo {

	public static void main(String[] args) {
		Number myOb = Integer.valueOf(9);
		
		if(myOb instanceof Integer iObj) //if instanceof succeeds, iObj is created
			System.out.println("iObj refers to an integer: "+iObj);
		
		//iObj does not exist here
//		System.out.println(iObj);
	}

}
