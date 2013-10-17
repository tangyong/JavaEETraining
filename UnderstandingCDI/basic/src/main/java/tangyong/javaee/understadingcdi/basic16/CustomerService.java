package tangyong.javaee.understadingcdi.basic16;

import javax.enterprise.event.Observes;

public class CustomerService {

  public void addCustomer(@Observes Customer customer){
	  System.out.println(customer.getName() + " is added!");
  }
}
