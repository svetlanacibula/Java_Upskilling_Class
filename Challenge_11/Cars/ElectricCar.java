package Challenge_11.Cars;

public class ElectricCar extends Car {

  private final boolean electricEngine;
  private final String color = "yellow";

  public ElectricCar(boolean electricEngine) {
    super();
    this.electricEngine = electricEngine;
  }

  @Override
  public void drive() {
    boolean engineStatus = runEngine(electricEngine);
    if (engineStatus) {
      System.out.println("The electric car is driving.");
    }
    else {
      System.out.println("Fuel powered car is driving.");
    }
  }

  @Override
  public String toString() {
    return "Tesla{" +
           "Color ='" + color + '\'' +
           '}';
  }
}
