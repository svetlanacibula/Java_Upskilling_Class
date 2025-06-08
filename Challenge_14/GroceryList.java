package Challenge_14;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class GroceryList {
  static Scanner scanner = new Scanner(System.in);
  static ArrayList<String> groceryList = new ArrayList<>();

  public static void main(String[] args) {
    while (true) {
      displayMenu();
      String choice = scanner.nextLine();

      switch (choice) {
        case "1":
          addItem();
          break;
        case "2":
          removeItem();
          break;
        case "0":
          System.out.println("Shutting down...");
          return;
        default:
          System.out.println("Invalid choice. Please try again.");
      }
    }
  }

  private static void displayMenu() {
    System.out.println("\n=== Grocery List Actions ===");
    Collections.sort(groceryList);
    System.out.println("Grocery list: " + groceryList);
    System.out.println("0. Shutdown");
    System.out.println("1. Add item");
    System.out.println("2. Remove item");
    System.out.print("Your input: ");
  }

  private static void addItem() {
    System.out.print("Enter item to add: ");
    String item = scanner.nextLine();
    groceryList.add(item);
    Collections.sort(groceryList);
    System.out.println(item + " added to the list.");
  }

  private static void removeItem() {
    System.out.print("Enter item to remove: ");
    String item = scanner.nextLine();
    if (groceryList.remove(item)) {
      Collections.sort(groceryList);
      System.out.println(item + " removed from the list.");
    } else {
      System.out.println("Item not found.");
    }
  }
}

