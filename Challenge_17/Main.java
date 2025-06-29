package Challenge_17;

import java.util.ArrayList;

public class Main {
  public static void main(String[] args) {
    ArrayList<Mappable> mappables = new ArrayList<>();

    mappables.add(new Building("National opera"));
    mappables.add(new UtilityLine("High voltage line"));

    for (Mappable mappable : mappables) {
      mappable.printProperties();
      System.out.println("<<<<<<< " + "JSON format" + " >>>>>");
      System.out.println(mappable.toJSON());
    }
  }
}
