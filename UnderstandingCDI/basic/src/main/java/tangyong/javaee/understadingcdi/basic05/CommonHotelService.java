package tangyong.javaee.understadingcdi.basic05;

import javax.inject.Inject;

public class CommonHotelService {

  @Inject @HotelStarLevel(value = Level.ThreeStar)
  private Hotel hotel;

  public String getHotelName(){
	  return hotel.getName();
  }
}
