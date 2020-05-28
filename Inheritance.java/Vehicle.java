package inventory;

public abstract class Vehicle{

  //Properties
  private String make;
  private String model;
  private VehicleColors color;

  //Constructor
  public Vehicle(String make, String model, VehicleColors color){
    this.make = make;
    this.model = model;
    this.color = color;
  }

  // Getters and setter
  public String getMake(){
    return this.make;
  }
  public void setMake(String make){
    // if(make.length() > 3){
      this.make = make; 
    // } else {
      // System.out.println("Not enough characters")
    // }
  }
  public String getModel(){
    return this.model;
  }
  public void setModel(String model){
    this.model = model;
  }
  
  public VehicleColors getColor(){
    return this.color;
  }
  public void setColor(VehicleColors color){
    this.color = color;
  }

  // Abstract Method
  public abstract void honkHorn();

  // Overridden Methods
  @Override
  public String toString(){
    return "Make: " + this.make + ", Model: " + this.model;
  }
}