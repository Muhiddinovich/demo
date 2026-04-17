package study;

import java.util.Arrays;

public class ArrayTest {

	public static void main(String[] args) {
		String[] ejgStr = new String[][] { { null }, new String[] { "a", "b", "c" }, { new String() } }[0]; 
		String[] ejgStr1 = null; 
		String[] ejgStr2 = { null }; 
		System.out.println(ejgStr[0] + "  " + ejgStr2[0] + "  " + ejgStr1[0]); 
	}

}
