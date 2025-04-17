package Challenge_08;

public class Main {
  public static void main(String[] args) {
    SalariedEmployee Meghan = new SalariedEmployee ();
    HourlyEmployee DukeOfSussex = new HourlyEmployee();

    Meghan.name = "Meghan Sussex";
    Meghan.birthDate = "1982-08-05";
    Meghan.employeeId = 215640656;
    Meghan.annualSalary = 41000;
    Meghan.hireDate = "2016-07-01";
    System.out.println(Meghan);
    Meghan.isRetired = false;
    Meghan.retire();
    System.out.println("This month salary is " + Meghan.collectPay());
    Meghan.terminate("31.12.2025");

    System.out.println("+---<<<<<<<<<<<<<<<<< >>>>>>>>>>>>>>>>---+");
    DukeOfSussex.name = "Harry Sussex";
    DukeOfSussex.birthDate = "1984-11-10";
    DukeOfSussex.employeeId=344667546;
    DukeOfSussex.hireDate = "2016-07-01";
    System.out.println(DukeOfSussex);
    DukeOfSussex.hourlyPayRate = 7.46;
    System.out.println("Today salary is " + DukeOfSussex.collectPay());
    System.out.println("Harry will get payed double: " + DukeOfSussex.getDoublePay());
    DukeOfSussex.terminate("03.08.2026");
    
  }

}
