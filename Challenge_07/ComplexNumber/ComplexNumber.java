package Challenge_07.ComplexNumber;

public class ComplexNumber {
  private double real;
  private double imaginary;

  public ComplexNumber(double real, double imaginary) {
    this.real = real;
    this.imaginary = imaginary;
  }

  public double getReal() {
    return real;
  }

  public double getImaginary() {
    return imaginary;
  }

  public void add(double real, double imaginary) {
    this.real += real;
    this.imaginary += imaginary;
  }

  public void subtract(double real, double imaginary) {
    this.real -= real;
    this.imaginary -= imaginary;
  }

  public static ComplexNumber addNumbers(ComplexNumber num1, ComplexNumber num2) {
    double newReal = num1.real + num2.real;
    double newImaginary = num1.imaginary + num2.imaginary;
    return new ComplexNumber(newReal, newImaginary);
  }

  public static ComplexNumber subtractNumbers(ComplexNumber num1, ComplexNumber num2) {
    double newReal = num1.real - num2.real;
    double newImaginary = num1.imaginary - num2.imaginary;
    return new ComplexNumber(newReal, newImaginary);
  }

  @Override
  public String toString() {
    return real + " + " + imaginary + "i";
  }
}
