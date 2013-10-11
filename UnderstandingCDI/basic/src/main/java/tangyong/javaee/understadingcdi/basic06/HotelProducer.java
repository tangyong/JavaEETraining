package tangyong.javaee.understadingcdi.basic06;

import javax.enterprise.inject.Produces;

public class HotelProducer {
	
	@Produces
	@HotelStarLevel(value = Level.ThreeStar)
	public Hotel createThreeStarHotel(){
		return new ThreeStarHotel();
	}
	
	@Produces
	@HotelStarLevel(value = Level.FiveStar)
	public Hotel createFiveStarHotel(){
		return new FiveStarHotel();
	}

}
