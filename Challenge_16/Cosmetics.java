package Challenge_16;

public class Cosmetics extends ProductForSale {
  public Cosmetics(double price) {
    type = "Cosmetics";
    this.price = price;
    description = "Body butter Volume: 300 ml. Ingredients: Aqua, glycerin, mineral oil.";
  }

  @Override
  void showDetails() {
    System.out.println(description);
  }
}

