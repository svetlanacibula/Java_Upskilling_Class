package Challenge_11.Cars;

public class HybridCar extends Car {
  private final boolean electricEngine;
  private final boolean fuelEngine;
  private final int releaseYear = 2025;

  public HybridCar(boolean electricEngine, boolean fuelEngine) {
    super();
    this.electricEngine = electricEngine;
    this.fuelEngine = fuelEngine;
  }

  @Override
  public void drive() {
    if (electricEngine) {
      System.out.println("The car is driving using the electric engine.");
    }
    else if (fuelEngine) {
      System.out.println("The car is driving using the fuel engine.");
    }
    else {
      System.out.println("Battery low/out of gasoline");
    }
  }

  @Override
  public String toString() {
    return "Prius{" +
           "Releas year is ='" + releaseYear + '\'' +
           '}';
  }
}
