package Challenge_27;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        BankAccount acc1 = new BankAccount("CHK001", 1500.0, AccountType.CHECKING);
        BankAccount acc2 = new BankAccount("SAV001", 3000.0, AccountType.SAVING);
        BankAccount acc3 = new BankAccount("INV001", 5000.0, AccountType.INVESTMENT);
        BankAccount acc4 = new BankAccount("VIP001", 170000.0, AccountType.INVESTMENT);

        BankCustomer customer1 = new BankCustomer("Janis Paegle", "CUST1001", List.of(acc1, acc2));
        BankCustomer customer2 = new BankCustomer("Laima Papele", "CUST1002", List.of(acc3));

        BankCustomer.PremiumBankCustomer premium = new BankCustomer.PremiumBankCustomer("Diana", "CUST999", List.of(acc4), 1200);

        System.out.println("Customer 1: " + customer1.getCustomerName() + ", ID: " + customer1.getCustomerId());
        System.out.println("Customer 2: " + customer2.getCustomerName() + ", ID: " + customer2.getCustomerId());
        System.out.println("Premium customer: " + premium.getCustomerName() + ", ID: " + premium.getCustomerId() + ", account: " + premium.getAccounts() + ", loyalty points: " + premium.getLoyaltyPoints());


        System.out.println("Customer 1 name still: " + customer1.getCustomerName());

       // The only thing that can be updated is account balance
        acc1.deposit(150);
        System.out.println(List.of(acc1));

        final StringBuilder sb = new StringBuilder();
        for (int i = 1; i < 90; i++) {
            sb.append((char) (i + 32));
        }

        StringBuilder customer = new StringBuilder(customer1.getCustomerName());
        StringBuilder customerUpdated =  addDoubleSurname(new StringBuilder(customer));
        System.out.println("Customer 1 after update: " + customerUpdated);
        System.out.println("Customer's 1 name in origin: " + customer1.getCustomerName());

        StringBuilder vipCustomer = new StringBuilder(premium.getCustomerId());
        StringBuilder vipCustomerUpdate = addValue(new StringBuilder(vipCustomer));
        System.out.println("Premium customer's ID after update: " + vipCustomerUpdate);
        System.out.println("Premium customer's ID origin: " + premium.getCustomerId());


    }
    static StringBuilder addDoubleSurname(final StringBuilder sb) {
        sb.append("-Skuja");
        return sb;
    }
    static StringBuilder addValue(final StringBuilder sb) {
        sb.append("087X");
        return sb;
    }

}