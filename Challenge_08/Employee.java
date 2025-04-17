package Challenge_08;

public class Employee extends Worker {
  protected long employeeId;
  protected String hireDate;

  public String toString() {
    return "Employee ID: " + employeeId + ", Name: " + name + ", Age: " + getAge() + ", Birth Date: " + birthDate +
           ", Hire Date: " + hireDate;
  }
}
