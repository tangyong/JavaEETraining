package tangyong.javaee.understadingcdi.basic02;

import org.jboss.weld.environment.se.Weld;
import org.jboss.weld.environment.se.WeldContainer;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class CTest {

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
  public void checkCName() {
    CService cService = container.instance().select(CService.class).get();
    assertTrue(cService.getName().equalsIgnoreCase("AImpBImp"));
  }
}
