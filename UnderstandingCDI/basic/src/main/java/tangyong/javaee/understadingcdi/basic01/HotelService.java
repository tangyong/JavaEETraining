package tangyong.javaee.understadingcdi.basic01;

import javax.inject.Inject;

public class HotelService {

  @Inject
  private Hotel hotel;

  public String getHotelName(){
	  return hotel.getName();
  }
}
