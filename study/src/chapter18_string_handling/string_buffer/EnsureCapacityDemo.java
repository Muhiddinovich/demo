package chapter18_string_handling.string_buffer;

public class EnsureCapacityDemo {

	public static void main(String[] args) {
		StringBuffer sBuffer = new StringBuffer();
		sBuffer.ensureCapacity(50);
		System.out.println(sBuffer.capacity());
	}

}
