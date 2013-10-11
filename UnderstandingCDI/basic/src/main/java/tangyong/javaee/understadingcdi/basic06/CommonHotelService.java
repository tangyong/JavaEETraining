package tangyong.javaee.understadingcdi.basic06;

import javax.inject.Inject;

public class CommonHotelService {

  @Inject @HotelStarLevel(value = Level.ThreeStar)
  private Hotel hotel;

  public String getHotelName(){
	  return hotel.getName();
  }
}
