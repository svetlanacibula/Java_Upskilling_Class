package Challenge_03;

public class Challenge_03_Phone_Number {
  public static void main(String[] args) {

    String number = "+370 29587848";
    Long longNumber = 35829587848L;

    System.out.println("Country " + printCountryCode(number));
    System.out.println("Country (Long): " + printCountryCode(longNumber));
  }

  public static String printCountryCode(String number) {

    String countryCode = number.substring(0, 4);
    return switch (countryCode) {
      case "+371" -> "Latvia";
      case "+372" -> "Estonia";
      case "+370" -> "Lithuania";
      case "+46 " -> "Sweden";
      case "+47 " -> "Norway";
      case "+358" -> "Finland";
      case "+48 " -> "Poland";
      case "+49 " -> "Germany";
      case "+45 " -> "Denmark";
      default -> "Wrong number";
    };
  }

  public static String printCountryCode(Long number) {
    String numberStr = "+" + number.toString().substring(0, 3);
    return switch (numberStr) {
      case "+371" -> "Latvia";
      case "+372" -> "Estonia";
      case "+370" -> "Lithuania";
      case "+46 " -> "Sweden";
      case "+47 " -> "Norway";
      case "+358" -> "Finland";
      case "+48 " -> "Poland";
      case "+49 " -> "Germany";
      case "+45 " -> "Denmark";
      default -> "Wrong number";
    };
  }
}
