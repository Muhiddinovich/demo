package chapter14_lambda_expressions.block_lambda;

public class BlockLambdaDemo2 {
	public static void main(String[] args) {
		StringFunc reverse = (s)->{
			String result="";
			for(int i=s.length()-1;i>=0;i--) {
				result+=s.charAt(i);
			}
			return result;
		};
		
		System.out.println(reverse.func("Lambda"));
	}
}
