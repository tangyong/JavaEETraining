package tangyong.javaee.understadingcdi.basic14;

import javax.inject.Inject;

@I
public class HotelService {

	@Inject
	private Hotel hotel;

	public String getHotelName() {
		return hotel.getName();
	}
}
