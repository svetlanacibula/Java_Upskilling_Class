package Challenge_08;

public class HourlyEmployee extends Employee {
  public double hourlyPayRate;

  public double getDoublePay() {
    return collectPay() *2;
  }
  @Override
  public double collectPay(){
    return Math.round((hourlyPayRate*8) * 100) / 100.0;
  }
}

