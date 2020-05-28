import inventory.Vehicle;
import inventory.Truck;
import inventory.Car;
import inventory.electric.ElectricCar;
import inventory.electric.Chargeable;
import inventory.VehicleColors;

class Main {
  public static void main(String[] args) {

    // Vehicle myVehicle = new Vehicle("Honda", "Civic");
    // // myVehicle.setMake("Honda");
    // // myVehicle.setModel("Civic");
    // System.out.println(myVehicle);

    // Short cap = 500;
    // Truck myTruck = new Truck("Ford", "F150", cap, true);
    // System.out.println(myTruck);

    // Car myCar = new Car("Hundai", "Sonata", 100);
    // System.out.println(myCar);

    ElectricCar myECar = new ElectricCar("Tesla", "Model S", VehicleColors.GRAY, 50, 2000, "NEMA 14-50");
    // myECar.honkHorn();
    System.out.println(myECar.getColor());
  }
}