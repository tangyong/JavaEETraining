package tangyong.javaee.understadingcdi.basic01;

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
    HotelService hotelService = container.instance().select(HotelService.class).get();
    assertTrue(hotelService.getHotelName().equalsIgnoreCase("FiveStarHotel"));
  }
}
