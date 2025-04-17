package Challenge_08;

public class SalariedEmployee extends Employee {
  public double annualSalary;
  public boolean isRetired;

  public void retire(){
    if (isRetired == false){
      System.out.println("Still working");
    }
    else{
      System.out.println("Is retired");
    }
  }
  @Override
  public double collectPay(){
    return Math.round((annualSalary / 12) * 100) / 100.0;
  }
}

