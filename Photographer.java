import java.util.HashMap;
import java.util.ArrayList;

public class Photographer{

  private ArrayList<Camera> cameras;
  private HashMap<String, Integer> journal;

  public Photographer(){
    this.cameras = new ArrayList<Camera>();
    this.journal = new HashMap<String, Integer>();
  }

  public void addCamera(Camera camera){
    cameras.add(camera);
  }

  public void removeCamera(Camera camera){
    this.cameras.remove(camera);
  }

  public int cameraCount(){
    return cameras.size();
  }

  public int journalCount(){
    return journal.size();
  }

  public void addToJournal(String event, Integer photos){
    journal.put(event, photos);
  }


}