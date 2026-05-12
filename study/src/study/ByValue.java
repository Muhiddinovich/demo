package study;

public class ByValue {

	public static void start(int number) {
	    System.out.println(number);
	    number = 3;
	    System.out.println( number);
	}
	public static void main(String[] args) {
	    int number = 5;
	    System.out.println(number);
	    start(number);
	    System.out.println(number);
	}
	

}
