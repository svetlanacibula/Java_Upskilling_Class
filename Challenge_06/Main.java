package Challenge_06;

public class Main {
  public static void main(String[] args) {
    Account accountOne = new Account("LV123FOOBAR123450000", 100, "Tom Hardy", "hardy@tom.com", "+100125875656");
    Account accountTwo = new Account("LV123FOOBAR678910000", 50, "Bruce Wayne", "wayne@bruce.com", "+123455875000");

    accountOne.printStatement();
    accountTwo.printStatement();

    accountTwo.withdrawFunds(10);
    accountOne.depositFunds(23);

    accountOne.printStatement();
    accountTwo.printStatement();

    Calculator calculator = new Calculator();
    calculator.setFirstNumber(5.0);
    calculator.setSecondNumber(4);
    System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
    System.out.println("add= " + calculator.getAdditionalResult());
    System.out.println("subtract= " + calculator.getSubtractionResult());
    calculator.setFirstNumber(5.25);
    calculator.setSecondNumber(0);
    System.out.println("multiply= " + calculator.getMultiplicationResult());
    System.out.println("divide= " + calculator.getDivisionResult());
    System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");

    Customer customer = new Customer();
    customer.getName();
    customer.getEmail();
    customer.getCreditLimit();
    System.out.println("Name: " + customer.getName());
    System.out.println("Email: " + customer.getEmail());
    System.out.println("Credit limit: " + customer.getCreditLimit());
  }
}
