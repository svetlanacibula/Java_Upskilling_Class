package Challenge_06;

public class Calculator {
  private double firstNumber;
  private double secondNumber;
  private double additionalResult;
  private double substractionResult;
  private double multiplicationResult;
  private double divisionResult;

  public double getFirstNumber() {
    return firstNumber;
  }

  public void setFirstNumber(double firstNumber) {
    this.firstNumber = firstNumber;
  }

  public double getSecondNumber() {
    return secondNumber;
  }

  public void setSecondNumber(double secondNumber) {
    this.secondNumber = secondNumber;
  }

  public double getAdditionalResult() {
    additionalResult = firstNumber + secondNumber;
    return additionalResult;
  }

  public double getSubtractionResult() {
    substractionResult = firstNumber - secondNumber;
    return substractionResult;
  }

  public double getMultiplicationResult() {
    multiplicationResult = firstNumber * secondNumber;
    return multiplicationResult;
  }

  public double getDivisionResult() {
    if (secondNumber == 0) {
      return 0;
    }
    divisionResult = firstNumber / secondNumber;
    return divisionResult;
  }
}
