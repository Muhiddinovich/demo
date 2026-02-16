package chapter14_lambda_expressions.block_lambda;

public class BlockLambdaDemo {
	public static void main(String[] args) {
		NumericFunc numericFunc=(n)->{
			int factorial=1;
			for(int i=1;i<=n;i++) {
				factorial *=i;
			}
			return factorial;
		};
		System.out.println(numericFunc.func(5));
	}
}
