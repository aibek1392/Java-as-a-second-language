package inventory;

public abstract class Car extends Vehicle{
  private Integer trunkCap;

  public Car(String make, String model, VehicleColors color, Integer trunkCap){
    super(make, model, color);
    this.trunkCap = trunkCap;
  }

  public Integer getTrunkCap(){
    return this.trunkCap;
  }
  public void setTrunkCap(Integer trunkCap){
    this.trunkCap = trunkCap;
  }

  @Override
  public String toString(){
    return super.toString() + ", Trunk Capacity: " + this.trunkCap + "lbs";
  }
}