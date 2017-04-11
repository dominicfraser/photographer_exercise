import static org.junit.Assert.assertEquals;
import org.junit.*;

public class PhotographerTest{

  Photographer photographer;
  DigitalCamera digitalCamera;

  @Before
  public void before(){
    photographer = new Photographer();
    digitalCamera = new DigitalCamera("Canon", true);
  }

  @Test 
  public void hasCamera(){
    photographer.addCamera(digitalCamera);
    assertEquals( 1,photographer.cameraCount() );
  }

  @Test
  public void canRemoveCamera(){
    photographer.addCamera(digitalCamera);
    photographer.removeCamera(digitalCamera);
     assertEquals ( 0,photographer.cameraCount() );
  }


}

