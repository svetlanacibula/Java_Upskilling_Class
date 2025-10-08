package Challenge_27;

import java.util.ArrayList;
import java.util.List;

public class BankCustomer {
    private final String customerName;
    private final String customerId;
    private final List<BankAccount> accounts;


    public BankCustomer(String customerName, String customerId, List<BankAccount> accounts) {
        this.customerName = customerName;
        this.customerId = customerId;
        this.accounts = new ArrayList<>(accounts);
    }


    public String getCustomerName() {
        return customerName;
    }

    public String getCustomerId() {
        return customerId;
    }

    public List<BankAccount> getAccounts() {
        return accounts;
    }


    public static class PremiumBankCustomer extends BankCustomer {
        private final int loyaltyPoints;

        public PremiumBankCustomer(String customerName, String customerId, List<BankAccount> accounts, int loyaltyPoints) {
            super(customerName, customerId, accounts);
            this.loyaltyPoints = loyaltyPoints;
        }

        public int getLoyaltyPoints() {
            return loyaltyPoints;
        }

    }
}
