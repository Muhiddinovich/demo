import provider.com.example.provider.MyServiceImp;
import service.com.example.service.MyService;

module provider {
	requires service;
	provides MyService with MyServiceImp;
}