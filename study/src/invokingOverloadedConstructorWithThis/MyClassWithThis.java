package invokingOverloadedConstructorWithThis;

public class MyClassWithThis {
	int a;
	int b;

	MyClassWithThis(int i, int j) {
		a = i;
		b = j;
	}

	MyClassWithThis(int i) {
		this(i, i);
	}

	MyClassWithThis() {
		this(0, 0);
	}

}
