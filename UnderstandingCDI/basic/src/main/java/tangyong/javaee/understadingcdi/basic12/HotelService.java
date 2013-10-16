package tangyong.javaee.understadingcdi.basic12;

import javax.inject.Inject;
import javax.interceptor.Interceptors;

@Interceptors({I2.class, I1.class})
public class HotelService {

	@Inject
	private Hotel hotel;

	public String getHotelName() {
		return hotel.getName();
	}
}
