public class Lesson_03_Unit_Convertor {
  public static void main(String[] args) {

    int heightInInches = 5;
    int heightInFeet = 3;
    double heightInCentimetersMethod1 = convertInchToCentimeters(heightInInches);
    double heightInCentimetersMethod2 = convertFeetAndInchesToCentimeters(heightInFeet, heightInInches);


    System.out.println("Height in centimeters is " + heightInCentimetersMethod1 + "cm");
    System.out.println("Height in inches is " + heightInCentimetersMethod2 + "cm");
  }

    public static double convertInchToCentimeters(int inches) {
      double centimeterPerInch = 2.54;
      return inches * centimeterPerInch;
    }

    public static double convertFeetAndInchesToCentimeters(int feet, int inches) {
    int totalInches = (feet * 12) + inches;
    return convertInchToCentimeters(totalInches);
    }

}
