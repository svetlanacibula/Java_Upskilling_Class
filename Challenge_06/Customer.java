package Challenge_06;

public class Customer {
  private final String name;
  private final int creditLimit;
  private final String email;

  public Customer(String name, int creditLimit, String email) {
    this.name = name;
    this.creditLimit = creditLimit;
    this.email = email;
  }

  public Customer() {
    this("Default Name", 5000, "default@example.com");
  }

  public Customer(String name, String email) {
    this(name, 5000, email);
  }

  public String getName() {
    return name;
  }

  public int getCreditLimit() {
    return creditLimit;
  }

  public String getEmail() {
    return email;
  }
}
