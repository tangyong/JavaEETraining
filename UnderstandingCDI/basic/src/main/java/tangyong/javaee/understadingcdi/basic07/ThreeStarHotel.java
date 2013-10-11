package tangyong.javaee.understadingcdi.basic07;

public class ThreeStarHotel implements Hotel{
	
	private int weightOfPrice = 1;
	private final int PRICE = 300; 
	
	public ThreeStarHotel(int weightOfPrice){
		this.weightOfPrice = weightOfPrice;
	}

	@Override
	public String getName() {
		return "ThreeStarHotel";
	}

	@Override
	public int getPriceOfStandardRoom() {
		return PRICE*weightOfPrice;
	}

}
