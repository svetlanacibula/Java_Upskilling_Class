package Challenge_07.ComplexNumber;

public class Main {
  public static void main(String[] args) {

    ComplexNumber complexNum1 = new ComplexNumber(3.0, 4.2);
    ComplexNumber complexNum2 = new ComplexNumber(2.0, 1.0);

    System.out.println("Complex Number 1: " + complexNum1);
    System.out.println("Complex Number 2: " + complexNum2);

    complexNum1.add(2.0, 3.0);
    System.out.println("Result after addition: " + complexNum1);

    complexNum1.subtract(1.0, 2.0);
    System.out.println("Result  after subtraction: " + complexNum1);
    System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<< >>>>>>>>>>>>>>>>>>>>>>>>>>>>>");

    ComplexNumber addResult = ComplexNumber.addNumbers(complexNum1, complexNum2);
    ComplexNumber subtractResult = ComplexNumber.subtractNumbers(complexNum1, complexNum2);

    System.out.println("Result after addition: " + addResult);

    System.out.println("Result after subtraction: " + subtractResult);
  }
}





