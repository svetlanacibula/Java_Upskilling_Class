package Challenge_06;

public class Account {
  private String accountNumber;
  private int accountBalance;
  private String customerName;
  private String customerEmail;
  private String customerPhoneNumber;

  public Account(String accountNumber, int accountBalance, String customerName, String customerEmail, String customerPhoneNumber) {
    this.accountNumber = accountNumber;
    this.accountBalance = accountBalance;
    this.customerName = customerName;
    this.customerEmail = customerEmail;
    this.customerPhoneNumber = customerPhoneNumber;
  }

  public String getAccountNumber() {
    return accountNumber;
  }

  public void setAccountNumber(String accountNumber) {
    this.accountNumber = accountNumber;
  }

  public double getAccountBalance() {
    return accountBalance;
  }

  public void setAccountBalance(int accountBalance) {
    this.accountBalance = accountBalance;
  }

  public String getCustomerName() {
    return customerName;
  }

  public void setCustomerName(String customerName) {
    this.customerName = customerName;
  }

  public String getCustomerEmail() {
    return customerEmail;
  }

  public void setCustomerEmail(String customerEmail) {
    this.customerEmail = customerEmail;
  }

  public String getCustomerPhoneNumber() {
    return customerPhoneNumber;
  }

  public void setCustomerPhoneNumber(String customerPhoneNumber) {
    this.customerPhoneNumber = customerPhoneNumber;
  }

  public void depositFunds(int amount) {
    System.out.println("Payment in progress!");
    this.accountBalance += amount;
  }

  public void withdrawFunds(int amount) {
    System.out.println("Payment in progress!");
    this.accountBalance -= amount;
  }

  public void printStatement() {
    System.out.println("               ");
    System.out.println("-= Statement =-");
    System.out.println("Account: " + getAccountNumber());
    System.out.println("Balance: " + getAccountBalance());
    System.out.println("Owner: " + getCustomerName());
    System.out.println("Phone number: " + getCustomerPhoneNumber());
    System.out.println("Email: " + getCustomerEmail());
  }
}
