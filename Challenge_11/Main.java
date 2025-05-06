package Challenge_11;

import Challenge_11.Cars.Car;
import Challenge_11.Cars.ElectricCar;
import Challenge_11.Cars.FuelPoweredCar;
import Challenge_11.Cars.HybridCar;

import java.util.ArrayList;
import java.util.List;

public class Main {

  public static void main(String[] args) {

    Car car = new Car();
    ElectricCar tesla = new ElectricCar(true);
    FuelPoweredCar vw = new FuelPoweredCar(true);
    HybridCar prius = new HybridCar(true, false);

    tesla.startEngine();
    tesla.drive();
    System.out.println(tesla);
    System.out.println("<<<<<<<<<<<<<<<<<<< +++ >>>>>>>>>>>>>>>>>>>>>>");

    vw.startEngine();
    vw.drive();
    System.out.println(vw);
    System.out.println("<<<<<<<<<<<<<<<<<<< +++ >>>>>>>>>>>>>>>>>>>>>>");

    prius.startEngine();
    prius.drive();
    System.out.println(prius);
    System.out.println("<<<<<<<<<<<<<<<<<<< +++ >>>>>>>>>>>>>>>>>>>>>>");

    List<Car> cars = new ArrayList<>();

    cars.add(car);
    cars.add(tesla);
    cars.add(vw);
    cars.add(prius);

    for (Car c : cars) {
      c.startEngine();
      c.drive();
      if (c instanceof FuelPoweredCar) {
        ((FuelPoweredCar)c).goToTheGasStation();
      }
    }
  }
}
