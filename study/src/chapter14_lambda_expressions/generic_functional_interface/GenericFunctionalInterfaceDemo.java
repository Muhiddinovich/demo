package chapter14_lambda_expressions.generic_functional_interface;

public class GenericFunctionalInterfaceDemo {
	public static void main(String[] args) {
		SomeFunc<String> reverse = (str)->{
			String result="";
			for(int i=str.length()-1;i>=0;i--) {
				result+=str.charAt(i);
			}
			return result;
		};
		
		SomeFunc<Integer> factorial = (n)->{
			int result=1;
			for(int i=1;i<=n;i++) {
				result *=i;
			}
			return result;
		};
		
		System.out.println(reverse.func("Here is Lambda"));
		System.out.println(factorial.func(5));
	}
}
