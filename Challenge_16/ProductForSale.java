package Challenge_16;

abstract class ProductForSale {

  protected String type;
  protected double price;
  protected String description;

  public double getSalesPrice(int quantity) {
    return price * quantity;
  }

  void printPricedItem(int quantity) {
    if (quantity == 1) {
      System.out.println(quantity + " item at " + price + " euro each.");
    }
    else {
      System.out.println(quantity + " items at " + price + " euro each.");
    }
  }

  abstract void showDetails();

  @Override
  public String toString() {
    return "ProductForSale{" +
           "type='" + type + '\'' +
           ", price=" + price +
           ", description='" + description + '\'' +
           '}';
  }

  public String getType() {
    return type;
  }

  public double getPrice() {
    return price;
  }
}
