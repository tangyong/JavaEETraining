package tangyong.javaee.understadingcdi.basic04;

import javax.inject.Inject;

public class CommonHotelService {

  @Inject @ThreeStarLevel
  private Hotel hotel;

  public String getHotelName(){
	  return hotel.getName();
  }
}
