package tangyong.javaee.understadingcdi.basic09;

import javax.inject.Inject;
import javax.interceptor.Interceptors;

public class HotelService {

	@Inject
	private Hotel hotel;

	@Interceptors(LoggingInterceptor.class)
	public String getHotelName() {
		return hotel.getName();
	}
}
