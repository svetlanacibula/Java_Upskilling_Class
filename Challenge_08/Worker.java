package Challenge_08;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Worker {
  protected String name;
  protected String birthDate;
  protected String endDate;

  public int getAge() {
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
    LocalDate birthDateParsed = LocalDate.parse(birthDate, formatter);
    return Period.between(birthDateParsed, LocalDate.now()).getYears();
  }

  public double collectPay() {
    return 0;
  }

  public void terminate(String endDate){
    System.out.println("Contract will be terminated on: " + endDate);
  }



}
