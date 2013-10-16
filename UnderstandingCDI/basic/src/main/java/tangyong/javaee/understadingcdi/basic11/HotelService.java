package tangyong.javaee.understadingcdi.basic11;

import javax.annotation.PostConstruct;
import javax.inject.Inject;
import javax.interceptor.Interceptors;

@Interceptors(LoggingInterceptor.class)
public class HotelService {

	@Inject
	private Hotel hotel;
	
	@PostConstruct
	public void init() {
	   System.out.println("Calling HotelService.init()!");
	}

	public String getHotelName() {
		return hotel.getName();
	}
}
