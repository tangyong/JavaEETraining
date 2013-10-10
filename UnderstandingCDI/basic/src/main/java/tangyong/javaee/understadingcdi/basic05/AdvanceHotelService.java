package tangyong.javaee.understadingcdi.basic05;

import javax.inject.Inject;

public class AdvanceHotelService {

  @Inject @HotelStarLevel(value = Level.FiveStar)
  private Hotel hotel;

  public String getHotelName(){
	  return hotel.getName();
  }
}
