package tangyong.javaee.understadingcdi.basic03;

import javax.enterprise.inject.Alternative;

@Alternative
public class ThreeStarHotel implements Hotel{

	@Override
	public String getName() {
		return "ThreeStarHotel";
	}

}
