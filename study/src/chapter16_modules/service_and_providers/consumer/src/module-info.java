import service.com.example.service.MyService;

module consumer {
	requires service;
	uses MyService;
}