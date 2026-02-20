package chapter14_lambda_expressions.method_reference.to_instance_method2;

public class InstanceMethWithObjectRefDemo {
	static <T> int counter(T[] vals, MyFunc<T> f, T v) {
		int count = 0;
		for (int i = 0; i < vals.length; i++) {
			if (f.func(vals[i], v))
				count++;
		}
		return count;
	}

	public static void main(String[] args) {
		int count;
		HighTemp[] weekDayHighsHighTemp = { new HighTemp(89), new HighTemp(82), new HighTemp(90), new HighTemp(89),
				new HighTemp(89), new HighTemp(91), new HighTemp(84), new HighTemp(83) };

		count = counter(weekDayHighsHighTemp, HighTemp::sameTemp, new HighTemp(89));

		System.out.println(count + " days had a high of 89");

		HighTemp[] weekDayHighs2 = { new HighTemp(32), new HighTemp(12), new HighTemp(24), new HighTemp(19),
				new HighTemp(18), new HighTemp(12), new HighTemp(-1), new HighTemp(13) };

		count = counter(weekDayHighs2, HighTemp::sameTemp, new HighTemp(12));

		System.out.println(count + " days had a high of 12");

		count = counter(weekDayHighsHighTemp, HighTemp::lessThanTemp, new HighTemp(89));
		System.out.println(count + " days had a high less than 89");

		count = counter(weekDayHighs2, HighTemp::lessThanTemp, new HighTemp(19));
		System.out.println(count + " days had a high less than 19");
	}
}
