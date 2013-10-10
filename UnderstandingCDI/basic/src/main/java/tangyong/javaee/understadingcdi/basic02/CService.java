package tangyong.javaee.understadingcdi.basic02;

import javax.inject.Inject;

public class CService {
	@Inject
	private AInf a;
	
	public String getName(){
		return a.getName();
	}

}
