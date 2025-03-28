package Challenge_05;

import java.util.Scanner;

public class Challenge_05_All_Tasks {

  private static final Scanner scanner = new Scanner(System.in);

  public static void main(String[] args) {

    int firstNumber = 0;
    int secondNumber = 0;
    int thirdNumber = 0;
    int fourthNumber = 0;
    int lastNumber = 0;
    int enteredValue = 0;
    calculateAverage();

    while (true) {
      try {
        System.out.println("Enter the first number: ");
        firstNumber = Integer.parseInt(scanner.nextLine());
        break;
      }
      catch (NumberFormatException e) {
        System.out.println("Invalid input");
      }
      catch (Exception e) {
        System.out.println("Something went wrong");
        break;
      }
    }

    while (true) {
      try {
        System.out.println("Enter the second number: ");
        secondNumber = Integer.parseInt(scanner.nextLine());
        break;
      }
      catch (NumberFormatException e) {
        System.out.println("Invalid input");
      }
      catch (Exception e) {
        System.out.println("Something went wrong");
        break;
      }
    }

    while (true) {
      try {
        System.out.println("Enter the third number: ");
        thirdNumber = Integer.parseInt(scanner.nextLine());
        break;
      }
      catch (NumberFormatException e) {
        System.out.println("Invalid input");
      }
      catch (Exception e) {
        System.out.println("Something went wrong");
        break;
      }
    }

    while (true) {
      try {
        System.out.println("Enter the fourth number: ");
        fourthNumber = Integer.parseInt(scanner.nextLine());
        break;
      }
      catch (NumberFormatException e) {
        System.out.println("Invalid input");
      }
      catch (Exception e) {
        System.out.println("Something went wrong");
        break;
      }
    }

    while (true) {
      try {
        System.out.println("Enter the last number: ");
        lastNumber = Integer.parseInt(scanner.nextLine());
        break;
      }
      catch (NumberFormatException e) {
        System.out.println("Invalid input");
      }
      catch (Exception e) {
        System.out.println("Something went wrong");
        break;
      }
    }
    int sum = sumUpAllNumbers(firstNumber, secondNumber, thirdNumber, fourthNumber, lastNumber);
    System.out.println("The sum of all numbers is: " + sum);

    int minimalValue = Integer.MAX_VALUE;
    int maximalValue = Integer.MIN_VALUE;

    while (true) {
      /*String input = scanner.nextLine();

      if (input.equalsIgnoreCase("X")) {
        break;678
      }*/
      try {
        System.out.println("Enter a number or 'X' if you want to quit: ");
        enteredValue = Integer.parseInt(scanner.nextLine());
        if (enteredValue < minimalValue) {
          minimalValue = enteredValue;
        }
        if (enteredValue > maximalValue) {
          maximalValue = enteredValue;
        }
      }
      catch (NumberFormatException e) {
        System.out.println("Invalid input");
        break;
      }
      catch (Exception e) {
        System.out.println("Something went wrong");
      }
    }

    if (minimalValue == Integer.MAX_VALUE && maximalValue == Integer.MIN_VALUE) {
      System.out.println("No valid numbers were entered.");
    }
    else {
      System.out.println("Minimum value: " + minimalValue);
      System.out.println("Maximum value: " + maximalValue);
    }

    scanner.close();
  }

  public static int sumUpAllNumbers(int firstNumber, int secondNumber, int thirdNumber, int fourthNumber, int lastNumber) {
    return firstNumber + secondNumber + thirdNumber + fourthNumber + lastNumber;
  }

  public static void calculateAverage() {
    int suma = 0;
    long count = 0;

    while (true) {
      System.out.println("Enter any number:");

      /*if (input.equalsIgnoreCase("EXIT")) {
        break;
      }*/
      try {
        int numberEntered = Integer.parseInt(scanner.nextLine());
        suma += numberEntered;
        count++;
      }
      catch (NumberFormatException e) {
        long average = (count > 0) ? suma / count : 0;
        System.out.println("SUM = " + suma + ", AVG = " + average);
        break;
      }
    }
  }
}
