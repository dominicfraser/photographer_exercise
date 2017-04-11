import java.util.HashMap;
import java.util.ArrayList;

public class Photographer{

  private ArrayList<Camera> cameras;

  public Photographer(){
    this.cameras = new ArrayList<Camera>();
  }

  public void addCamera(Camera camera){
    cameras.add(camera);
  }

  public int cameraCount(){
    return cameras.size();
  }

}