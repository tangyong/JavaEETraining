package tangyong.javaee.understadingcdi.basic16;

import javax.enterprise.event.Event;
import javax.inject.Inject;

public class HotelService {

  @Inject
  private Hotel hotel;
  
  @Inject
  private Event<Customer> customerAddedEvent;

  public String getHotelName(){
	  return hotel.getName();
  }
  
  public void addHotelCustomer(Customer customer){
	  hotel.addCustomer(customer);
	  customerAddedEvent.fire(customer);
  }
}
