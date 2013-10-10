package tangyong.javaee.understadingcdi.basic04;

import javax.inject.Inject;

public class AdvanceHotelService {

  @Inject @FiveStarLevel
  private Hotel hotel;

  public String getHotelName(){
	  return hotel.getName();
  }
}
