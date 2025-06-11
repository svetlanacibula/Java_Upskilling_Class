package Challenge_15;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class TravelList {
  static class PlaceDistance {
    int km;
    String town;

    public PlaceDistance(String town, int km) {
      this.km = km;
      this.town = town;
    }
  }

  public static class ListOfTowns {
    public static void main(String[] args) {
      LinkedList<PlaceDistance> list = new LinkedList<>();
      list.addFirst(new PlaceDistance("Riga", 0));
      list.add(new PlaceDistance("Ventspils", 186));
      list.add(new PlaceDistance("Marupe", 7));
      list.add(new PlaceDistance("Salaspils", 18));
      list.add(new PlaceDistance("Tukums", 35));
      list.add(new PlaceDistance("Jurmala", 15));
      list.add(new PlaceDistance("Jelgava", 36));
      list.add(new PlaceDistance("Ogre", 37));
      Collections.sort(list, Comparator.comparing(town -> town.km));

      ListIterator<PlaceDistance> iterator = list.listIterator();
      Scanner scanner = new Scanner(System.in);

      while (true) {
        System.out.println("\n<<<<< Available actions >>>>>");
        System.out.println("(F)orward");
        System.out.println("(B)ackward");
        System.out.println("(L)ist places");
        System.out.println("(Q)uit");
        System.out.print("Choose an action: ");
        String action = scanner.nextLine().toUpperCase();

        switch (action) {
          case "F":
            moveForward(iterator);
            break;
          case "B":
            moveBackward(iterator);
            break;
          case "L":
            printListOfTowns(iterator);
            break;
          case "Q":
            System.out.println("Exiting...");
            return;
          default:
            System.out.println("Invalid action! Try again.");
        }
      }
    }

    public static void moveForward(ListIterator<PlaceDistance> iterator) {
      if (iterator.hasNext()) {
        PlaceDistance element = iterator.next();
        System.out.println("Moving forward to: " + element.town + ", Km: " + element.km);
      }
      else {
        System.out.println("Already at the end of the list!");
      }
    }

    public static void moveBackward(ListIterator<PlaceDistance> iterator) {
      if (iterator.hasPrevious()) {
        iterator.previous();
      }
      if (iterator.hasPrevious()) {
        PlaceDistance element = iterator.previous();
        System.out.println("Moving backward to: " + element.town + ", Km: " + element.km);
      }
      else {
        System.out.println("Already at the start of the list!");
      }
    }

    public static void printListOfTowns(ListIterator<PlaceDistance> iterator) {
      for (ListIterator<PlaceDistance> it = iterator; it.hasNext(); ) {
        PlaceDistance data = it.next();
        System.out.println("Town: " + data.town + ", Distance: " + data.km);
      }
    }
  }
}
