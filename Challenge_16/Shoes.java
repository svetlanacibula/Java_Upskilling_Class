package Challenge_16;

public class Shoes extends ProductForSale {

  public Shoes(double price) {
    type = "Shoes";
    this.price = price;
    description = "Shoes Outsole: synthetic; inner material: textile; outer material: textile.";
  }

  @Override
  void showDetails() {
    System.out.println(description);
  }
}
