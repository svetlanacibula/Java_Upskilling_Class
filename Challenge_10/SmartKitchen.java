package Challenge_10;

class Appliance{
  boolean hasWorkToDo;
}

public class SmartKitchen {

  private Refrigerator fridge = new Refrigerator();
  private CoffeMachine coffeeMaker = new CoffeMachine();
  private DishWasher dishWasher = new DishWasher();

  public void setAddWater(boolean addWater) {
    coffeeMaker.hasWorkToDo = addWater;
  }

  public void setLoadDishwasher(boolean loadDishwasher) {
    dishWasher.hasWorkToDo = loadDishwasher;
  }

  public void setPourMilk(boolean pourMilk) {
    fridge.hasWorkToDo = pourMilk;
  }

  public void doKitchenWork() {
    fridge.orderFood();
    coffeeMaker.brewCoffee();
    dishWasher.doDishes();
  }

  class Refrigerator extends Appliance {
    public void orderFood() {
      if (hasWorkToDo) {
        System.out.println("Work is done!");
      }
    }
  }

  class CoffeMachine extends Appliance {
    public void brewCoffee() {
      if (hasWorkToDo) {
        System.out.println("Work is done!");
      }
    }

  }
  class DishWasher extends Appliance {
    public void doDishes() {
      if (hasWorkToDo) {
        System.out.println("Work is done!");
      }
    }
  }
}


