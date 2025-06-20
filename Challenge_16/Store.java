package Challenge_16;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

public class Store {
  public List<OrderItem> basket = new ArrayList<>();

  public static void main(String[] args) {

    System.out.println("~~~~~~ PRODUCTS FOR SALE ~~~~~~~~~");
    System.out.println(" ");

    Shoes shoes = new Shoes(109.99);
    shoes.showDetails();
    shoes.printPricedItem(1);
    System.out.println("Shoes total price is " + shoes.getSalesPrice(1));

    System.out.println("<<<<<<<< >>>>>>>>>>>");
    System.out.println(" ");
    Clothes clothes = new Clothes(78.99);
    clothes.showDetails();
    clothes.printPricedItem(1);
    System.out.println("Parka total price is " + clothes.getSalesPrice(1));

    System.out.println("<<<<<<<< >>>>>>>>>>>");
    System.out.println(" ");
    Cosmetics cosmetics = new Cosmetics(12);
    cosmetics.showDetails();
    cosmetics.printPricedItem(1);
    System.out.println("Body butter total price is " + cosmetics.getSalesPrice(1));
    System.out.println(" ");

    Store store = new Store();
    store.basket.add(store.addItemToTheBasket(1, "Shoes", 99.99));
    store.basket.add(store.addItemToTheBasket(2, "Cosmetics", 12));
    store.basket.add(store.addItemToTheBasket(1, "Clothes", 69.89));

    printOrderTotal(store.basket);
  }

  public static void printOrderTotal(List<OrderItem> basket) {

    AtomicReference<Double> total = new AtomicReference<>(0.0);

    System.out.println("******** ORDER SUMMARY ********");
    basket.forEach(orderItem -> {
      System.out.format("type: %s, quantity: %d, price: €%.2f %n", orderItem.getProductForSale().getType(), orderItem.getQuantity(), orderItem.getProductForSale().getPrice());
      total.updateAndGet(v -> v + orderItem.getProductForSale().getSalesPrice(orderItem.getQuantity()));
    });

    System.out.printf("TOTAL ORDER PRICE: €%.2f%n", total.get());
  }

  public OrderItem addItemToTheBasket(int quantity, String item, double price) {
    switch (item) {
      case "Shoes":
        return new OrderItem(quantity, new Shoes(price));
      case "Clothes":
        return new OrderItem(quantity, new Clothes(price));
      case "Cosmetics":
        return new OrderItem(quantity, new Cosmetics(price));
      default:
        System.out.println("Out of stock: " + item);
    }
    return null;
  }
}


