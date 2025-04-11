package Challenge_07.Carpet;

public class Main {
  public static void main(String[] args) {
    Carpet carpetOne = new Carpet(2,3.5);
    Carpet carpetTwo = new Carpet(4.2, 6.4);
    Carpet carpetThree = new Carpet(8.5, -2.1);

    System.out.println("The first carpet area is: " + carpetOne.getArea() + ". This carpet will cost " + carpetOne.getTotalCost() + " EUR");
    System.out.println("<<<<<<<<<<      >>>>>>>>>>>");
    System.out.println("The second carpet area is: " + carpetTwo.getArea() + ". This carpet will cost " + carpetTwo.getTotalCost() + " EUR");
    System.out.println("<<<<<<<<<<      >>>>>>>>>>>");
    System.out.println("The third carpet area is: " + carpetThree.getArea() + ". This carpet will cost " + carpetThree.getTotalCost() + " EUR");
  }
}
