package consumer.com.example.consumer;

import java.util.ServiceLoader;

import service.com.example.service.MyService;

public class Main1 {
	public static void main(String[] args) {
		ServiceLoader<MyService> loader = ServiceLoader.load(MyService.class);
		for (MyService s : loader) {
			s.execute();
		}
	}
}
