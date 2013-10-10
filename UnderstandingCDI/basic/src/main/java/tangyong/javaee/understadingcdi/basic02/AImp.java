package tangyong.javaee.understadingcdi.basic02;

import javax.inject.Inject;

public class AImp implements AInf{

	private BInf b;
	
	@Inject
	public AImp(BInf b){
	   this.b = b;	
	}
	
	@Override
	public String getName() {
		return "AImp" + b.getName();
	}

}
