package tangyong.javaee.understadingcdi.basic13;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

@Loggable
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
