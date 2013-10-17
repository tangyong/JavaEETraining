package tangyong.javaee.understadingcdi.basic15;

import javax.decorator.Decorator;
import javax.decorator.Delegate;
import javax.inject.Inject;

@Decorator
public class FromFiveToSixStarHotelDecorator implements Hotel{

	@Inject @Delegate
	private Hotel hotel;
	
	@Override
	public String getName() {
		return "SixHotelUpgradedFrom" + hotel.getName();
	}

}
