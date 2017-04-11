import java.util.HashMap;
import java.util.ArrayList;

public class Photographer{

  private ArrayList<Camera> cameras;
  private ArrayList<BrandProviding> equipment;
  private HashMap<String, Integer> journal;

  public Photographer(){
    this.cameras = new ArrayList<Camera>();
    this.journal = new HashMap<String, Integer>();
    this.equipment = new ArrayList<BrandProviding>();
  }

  public void addCamera(Camera camera){
    this.cameras.add(camera);
    this.equipment.add(camera);
  }

  public void removeCamera(Camera camera){
    this.cameras.remove(camera);
    this.equipment.remove(camera);
  }

  public int cameraCount(){
    return cameras.size();
  }

  public int equipmentCount(){
    return equipment.size();
  }

  public int journalCount(){
    return journal.size();
  }

  public void addToJournal(String event, Integer photos){
    journal.put(event, photos);
  }


}