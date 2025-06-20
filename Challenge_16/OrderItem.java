package Challenge_16;

public class OrderItem {
  int quantity;
  ProductForSale productForSale;

  public OrderItem(int quantity, ProductForSale productForSale) {
    this.quantity = quantity;
    this.productForSale = productForSale;
  }

  public int getQuantity() {
    return quantity;
  }

  public ProductForSale getProductForSale() {
    return productForSale;
  }

  @Override
  public String toString() {
    return "OrderItem{" +
           "quantity=" + quantity +
           ", productForSale=" + productForSale +
           '}';
  }
}
