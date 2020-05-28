package inventory.electric;

import inventory.Car;
import inventory.VehicleColors;

public final class ElectricCar extends Car implements Chargeable{
  public Integer batteryCap;
  public String plugType;

  public ElectricCar(String make, String model, VehicleColors color, Integer trunkCap, Integer batteryCap, String plugType){
    super(make, model, color, trunkCap);
    this.batteryCap = batteryCap;
    this.plugType = plugType;
  }

  public Integer getBatteryCap(){
    return this.batteryCap;
  }
  public void setBatteryCap(){
    this.batteryCap = batteryCap;
  }

  public String getPlugType(){
    return this.plugType;
  }
  public void setPlugType(String plugType){
    this.plugType = plugType;
  }
  
  public void honkHorn(){
    System.out.println("hzzzzzz");
  }

  @Override
  public String toString(){
    return super.toString() + ", Battery Capacity: " + this.batteryCap + "kWh";
  }
}