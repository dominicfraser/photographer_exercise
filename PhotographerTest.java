import static org.junit.Assert.assertEquals;
import org.junit.*;

public class PhotographerTest{

  Photographer photographer;
  DigitalCamera digitalCamera;
  AnalogCamera analogueCamera;

  @Before
  public void before(){
    photographer = new Photographer();
    digitalCamera = new DigitalCamera("Canon", true);
    analogueCamera = new AnalogCamera("Canon", false);
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

  @Test
  public void canPrintStatusWhenFunctional(){
    assertEquals( "Canon is functional",digitalCamera.printDetails() );
  }  

  @Test
  public void canPrintStatusWhenBroken(){
    assertEquals( "Canon is broken", analogueCamera.printDetails() );
  }

  @Test
  public void canAddJournalEntry(){
    photographer.addToJournal( "Wedding1",20 )
    assertEquals ( 1, photographer.journalCount() );
  }

}

