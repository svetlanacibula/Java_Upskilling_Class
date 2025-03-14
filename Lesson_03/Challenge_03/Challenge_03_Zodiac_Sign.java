package Challenge_03;

import java.time.LocalDate;
import java.time.Month;
import java.time.YearMonth;

public class Challenge_03_Zodiac_Sign {
  public static void main(String[] args) {

    LocalDate date = LocalDate.of(2025, 03, 13);
    YearMonth yearMonth = YearMonth.of(2025, 2);  // March 2025
    int year = 2025;
    int month = 10;
    int day = 10;

    System.out.println(printZodiacSign(date) + " is born on this day");
    System.out.println(printZodiacSign(yearMonth, day) + " is born on this day");
    System.out.println(printZodiacSign(year, month, day) + " is born on this day");
  }

  public static String printZodiacSign(LocalDate date) {
    int day = date.getDayOfMonth();
    Month month = date.getMonth();

    return switch (month) {
      case JANUARY -> (day <= 20) ? "Capricorn" : "Aquarius";
      case FEBRUARY -> (day <= 20) ? "Aquarius" : "Pieces";
      case MARCH -> (day <= 20) ? "Pieces" : "Aries";
      case APRIL -> (day <= 20) ? "Aries" : "Taurus";
      case MAY -> (day <= 20) ? "Taurus" : "Gemini";
      case JUNE -> (day <= 20) ? "Gemini" : "Cancer";
      case JULY -> (day <= 20) ? "Cancer" : "Leo";
      case AUGUST -> (day <= 20) ? "Leo" : "Virgo";
      case SEPTEMBER -> (day <= 20) ? "Virgo" : "Libra";
      case OCTOBER -> (day <= 20) ? "Libra" : "Scorpius";
      case NOVEMBER -> (day <= 20) ? "Scorpius" : "Sagittarius";
      case DECEMBER -> (day <= 20) ? "Sagittarius" : "Capricorn";
      default -> "Wrong data";
    };
  }

  public static String printZodiacSign(YearMonth yearMonth, int day) {
    Month month = yearMonth.getMonth();

    return switch (month) {
      case JANUARY -> (day <= 20) ? "Capricorn" : "Aquarius";
      case FEBRUARY -> (day <= 20) ? "Aquarius" : "Pieces";
      case MARCH -> (day <= 20) ? "Pieces" : "Aries";
      case APRIL -> (day <= 20) ? "Aries" : "Taurus";
      case MAY -> (day <= 20) ? "Taurus" : "Gemini";
      case JUNE -> (day <= 20) ? "Gemini" : "Cancer";
      case JULY -> (day <= 20) ? "Cancer" : "Leo";
      case AUGUST -> (day <= 20) ? "Leo" : "Virgo";
      case SEPTEMBER -> (day <= 20) ? "Virgo" : "Libra";
      case OCTOBER -> (day <= 20) ? "Libra" : "Scorpius";
      case NOVEMBER -> (day <= 20) ? "Scorpius" : "Sagittarius";
      case DECEMBER -> (day <= 20) ? "Sagittarius" : "Capricorn";
      default -> "Wrong data";
    };
  }

  public static String printZodiacSign(int year, int month, int day) {
    Month monthEnum = Month.of(month);

    return switch (monthEnum) {
      case JANUARY -> (day <= 20) ? "Capricorn" : "Aquarius";
      case FEBRUARY -> (day <= 20) ? "Aquarius" : "Pisces";
      case MARCH -> (day <= 20) ? "Pisces" : "Aries";
      case APRIL -> (day <= 20) ? "Aries" : "Taurus";
      case MAY -> (day <= 20) ? "Taurus" : "Gemini";
      case JUNE -> (day <= 20) ? "Gemini" : "Cancer";
      case JULY -> (day <= 20) ? "Cancer" : "Leo";
      case AUGUST -> (day <= 20) ? "Leo" : "Virgo";
      case SEPTEMBER -> (day <= 20) ? "Virgo" : "Libra";
      case OCTOBER -> (day <= 20) ? "Libra" : "Scorpio";
      case NOVEMBER -> (day <= 20) ? "Scorpio" : "Sagittarius";
      case DECEMBER -> (day <= 20) ? "Sagittarius" : "Capricorn";
      default -> "Wrong data";
    };
  }
}
