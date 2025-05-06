package Challenge_11.Cars;

public class Car {
  String description;

  public Car() {
  }

  public void startEngine() {
    System.out.println("The engine is started");
  }

  public void drive() {
    boolean engineStatus = runEngine(false); // Defaulting to fuel-powered
    if (engineStatus) {
      System.out.println("Fuel powered car is driving.");
    }
  }

  protected boolean runEngine(boolean electricEngine) {
    return electricEngine; // Returns true for electric engines, false otherwise
  }

  @Override
  public String toString() {
    return "Car{" +
           ", description=" + description +
           '}';
  }
}
