package tangyong.javaee.understadingcdi.basic05;

@HotelStarLevel(value = Level.FiveStar)
public class FiveStarHotel implements Hotel{

	@Override
	public String getName() {
		return "FiveStarHotel";
	}

}
