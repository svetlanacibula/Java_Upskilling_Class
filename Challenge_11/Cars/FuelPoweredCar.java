package Challenge_11.Cars;

public class FuelPoweredCar extends Car {
  private final String fuelType = "gasoline";
  private final boolean fuelEngine;

  public FuelPoweredCar(boolean fuelEngine) {
    super();
    this.fuelEngine = fuelEngine;
  }

  @Override
  public void drive() {
    if (fuelEngine) {
      System.out.println("Fuel powered car is driving.");
    }
    else {
      System.out.println("Out of gasoline");
    }
  }

  @Override
  public String toString() {
    return "VW Passat{" +
           "Fuel type ='" + fuelType + '\'' +
           '}';
  }

  public void goToTheGasStation() {
    System.out.println("Driving to gas station");
  }
}
