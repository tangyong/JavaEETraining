package tangyong.javaee.understadingcdi.basic07;

import javax.enterprise.inject.Produces;

public class HotelProducer {
	
	@Produces
	@HotelStarLevel(value = Level.ThreeStar)
	@Holiday
	public Hotel createHotelWithHoliday(){
		return new ThreeStarHotel(2);
	}
	
	@Produces
	@HotelStarLevel(value = Level.ThreeStar)
	@NonHoliday
	public Hotel createHotelWithoutHoliday(){
		return new ThreeStarHotel(1);
	}	

}
