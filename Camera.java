public abstract class Camera{

  private String type;
  private boolean working;

  public Camera(String type, boolean working){
    this.type = type;
    this.working = working; 
  }

  public String printDetails(){
    String status = "undef";
    if(working){
      status = "is functional";
    }
    else{ 
      status = "is broken";
    }

    return this.type + " " + status;
  }



}