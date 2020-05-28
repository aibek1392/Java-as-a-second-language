package inventory;

public final class Truck extends Vehicle{
  private Short cargoCap;
  private Boolean hasHitch;

  public Truck(String make, String model, VehicleColors color, Short cargoCap, Boolean hasHitch){
    super(make, model, color);
    this.cargoCap = cargoCap;
    this.hasHitch = hasHitch;
  }

  public Short getCargoCap(){
    return this.cargoCap;
  }
  public void setCargoCap(Short cargoCap){
    this.cargoCap = cargoCap;
  }  
  
  public Boolean getHasHitch(){
    return this.hasHitch;
  }
  public void setHasHitch(Boolean hasHitch){
    this.hasHitch = hasHitch;
  }

  public void honkHorn(){
    System.out.println("HEEEEeeerrrrt");
  }

  @Override
  public String toString(){
    return super.toString() + ", Cargo Capacity: " + this.cargoCap + ", Has Hitch? " + this.hasHitch + ".";
  }

}