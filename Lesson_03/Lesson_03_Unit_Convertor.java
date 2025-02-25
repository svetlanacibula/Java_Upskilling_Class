public class Lesson_03_Unit_Convertor {
  public static void main(String[] args) {

    int heightInInches = 5;
    double heightInCentimeters = convertInchToCentimeters(heightInInches);
    System.out.println("Height in centimeters is " + heightInCentimeters + "cm");
  }

    public static double convertInchToCentimeters(int inches) {
      double centimeterPerInch = 2.54;
      return inches * centimeterPerInch;
    }

}
