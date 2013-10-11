package tangyong.javaee.understadingcdi.basic08;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Logger;

import javax.inject.Inject;
import javax.interceptor.AroundInvoke;
import javax.interceptor.InvocationContext;

public class HotelService {

	@Inject
	private Hotel hotel;
	
	Logger logger = Logger.getLogger(HotelService.class.getName());

	public String getHotelName() {
		return hotel.getName();
	}

	@AroundInvoke
	private Object logMethod(InvocationContext ic) throws Exception {
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		
		System.out.println("Current Time: " + df.format(new Date()) + " Entering TargetClassName: "+ ic.getTarget().getClass().getName() + 
    			"MethodName: " + ic.getMethod().getName());
		try {
			Thread.sleep(3000);
			return ic.proceed();
		} finally {
			System.out.println("Current Time: " + df.format(new Date()) + " Lefting TargetClassName: "+ ic.getTarget().getClass().getName() + 
	    			"MethodName: "+ ic.getMethod().getName());
		}
	}
}
