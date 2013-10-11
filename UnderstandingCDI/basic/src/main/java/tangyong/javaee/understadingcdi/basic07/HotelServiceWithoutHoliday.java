package tangyong.javaee.understadingcdi.basic07;

import javax.inject.Inject;

public class HotelServiceWithoutHoliday {

  @Inject 
  @HotelStarLevel(value = Level.ThreeStar)
  @NonHoliday
  private Hotel hotel;

  public String getHotelName(){
	  return hotel.getName();
  }
  
  public int getPriceOfStandardRoom(){
	  return hotel.getPriceOfStandardRoom();
  }
}
