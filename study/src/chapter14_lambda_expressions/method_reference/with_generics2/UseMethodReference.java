package chapter14_lambda_expressions.method_reference.with_generics2;

import java.util.ArrayList;
import java.util.Collections;

public class UseMethodReference {
	static int compareMC(MyClass a, MyClass b) {
		return a.getVal() - b.getVal();
	}

	public static void main(String[] args) {
		ArrayList<MyClass> al = new ArrayList<MyClass>();
		al.add(new MyClass(1));
		al.add(new MyClass(4));
		al.add(new MyClass(2));
		al.add(new MyClass(9));
		al.add(new MyClass(3));
		al.add(new MyClass(7));

		MyClass maxValObj = Collections.max(al, UseMethodReference::compareMC);
		System.out.println(maxValObj.getVal());

	}
}
