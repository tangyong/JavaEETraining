package tangyong.javaee.understadingcdi.basic04;

import org.jboss.weld.environment.se.Weld;
import org.jboss.weld.environment.se.WeldContainer;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class HotelTest {

  protected static Weld weld;
  protected static WeldContainer container;

  @BeforeClass
  public static void init() {
    weld = new Weld();
    container = weld.initialize();
  }

  @AfterClass
  public static void close() {
    weld.shutdown();
  }

  @Test
  public void checkHotelName() {
    CommonHotelService commonHotelService = container.instance().select(CommonHotelService.class).get();
    assertTrue(commonHotelService.getHotelName().equalsIgnoreCase("ThreeStarHotel"));
    
    AdvanceHotelService advanceHotelService = container.instance().select(AdvanceHotelService.class).get();
    assertTrue(advanceHotelService.getHotelName().equalsIgnoreCase("FiveStarHotel"));
  }
}
