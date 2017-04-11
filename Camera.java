public abstract class Camera implements BrandProviding{

  private String brand;
  private boolean working;

  public Camera(String brand, boolean working){
    this.brand = brand;
    this.working = working; 
  }

  public String printDetails(){
    String status = null;
    if(working){
      status = "is functional";
    }
    else{ 
      status = "is broken";
    }

    // String status = String.valueOf(this.working);
    //works but above is more useful output

    return this.brand + " " + status;
  }



}