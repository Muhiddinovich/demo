package chapter17_added_features.instanceofDemo;

public class WithLogicalAND {
	public static void main(String[] args) {
		Number myOb = Integer.valueOf(9);

		if ((myOb instanceof Integer iObj) && (iObj >= 0)) { //Java checks left side, if true then right side
			System.out.println(myOb +" is positive");
			System.out.println(iObj);
		}
		
//		if ((myOb instanceof Integer iObj) &&= (iObj >= 0)) {  //Error because Java checks both sides
//			System.out.println(myOb +" is positive");
//		}

//		int count =10;
//		if((count<100)&(myOb instanceof Integer iObj)) {
//			System.out.println("Worked"+iObj=);
//			
//		}
	}
}
