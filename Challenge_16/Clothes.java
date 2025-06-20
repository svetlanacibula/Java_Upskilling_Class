package Challenge_16;

public class Clothes extends ProductForSale {
  public Clothes(double price) {
    type = "Clothes";
    this.price = price;
    description = "Parka Outer material: 100% polyester";
  }

  @Override
  void showDetails() {
    System.out.println(description);
  }
}
