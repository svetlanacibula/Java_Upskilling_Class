package Challenge_20.Employee;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Employee> employees = List.of(
                new Employee("Alice", "Cooper", LocalDate.of(1964, 3, 10)),
                new Employee("Ozzy", "Osbourne", LocalDate.of(1968, 7, 22)),
                new Employee("Jim", "Morrison", LocalDate.of(1965, 1, 5)),
                new Employee("Marilyn", "Manson", LocalDate.of(1989, 11, 30))
        );

        processEmployees(employees);
    }

    public static void processEmployees(List<Employee> employees) {
        class EmployeeInfo {
            private final Employee employee;
            private final String fullName;
            private final int yearsActive;

            public EmployeeInfo(Employee employee) {
                this.employee = employee;
                this.fullName = employee.firstName() + " " + employee.lastName();
                this.yearsActive = Period.between(employee.hireDate(), LocalDate.now()).getYears();
            }

            public String getFullName() {
                return fullName;
            }

            public int getYearsActive() {
                return yearsActive;
            }

            @Override
            public String toString() {
                return "%-20s Career started: %s  Years Active: %d".formatted(
                        fullName, employee.hireDate(), yearsActive
                );
            }
        }
        List<EmployeeInfo> infoList = new ArrayList<>();
        for (Employee e : employees) {
            infoList.add(new EmployeeInfo(e));
        }

        System.out.println("🔹 Sorted by Full Name:");
        infoList.sort(new Comparator<EmployeeInfo>() {
            @Override
            public int compare(EmployeeInfo e1, EmployeeInfo e2) {
                return e1.getFullName().compareToIgnoreCase(e2.getFullName());
            }
        });
        infoList.forEach(System.out::println);

        System.out.println("\n🔹 Sorted by active years (Descending):");
        infoList.sort(new Comparator<EmployeeInfo>() {
            @Override
            public int compare(EmployeeInfo e1, EmployeeInfo e2) {
                return Integer.compare(e2.getYearsActive(), e1.getYearsActive());
            }
        });
        infoList.forEach(System.out::println);
    }

}
