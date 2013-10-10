package tangyong.javaee.understadingcdi.basic05;

@HotelStarLevel(value = Level.ThreeStar)
public class ThreeStarHotel implements Hotel{

	@Override
	public String getName() {
		return "ThreeStarHotel";
	}

}
