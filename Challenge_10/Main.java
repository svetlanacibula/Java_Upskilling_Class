package Challenge_10;

public class Main {
  public static void main(String[] args) {

    SmartKitchen Kitchen = new SmartKitchen();

    Kitchen.setAddWater(true);
    Kitchen.setLoadDishwasher(true);
    Kitchen.setPourMilk(true);

    Kitchen.doKitchenWork();

  }
}
