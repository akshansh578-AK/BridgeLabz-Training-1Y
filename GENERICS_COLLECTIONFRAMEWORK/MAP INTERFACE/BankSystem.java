import java.util.*;

public class BankSystem {

    private Map<String, Double> accounts = new HashMap<>();

    // 1. Add new account
    public void addAccount(String accNo, double balance) {
        accounts.put(accNo, balance);
    }

    // 2. Deposit
    public void deposit(String accNo, double amount) {
        if (accounts.containsKey(accNo)) {
            accounts.put(accNo, accounts.get(accNo) + amount);
        } else {
            System.out.println("Account not found: " + accNo);
        }
    }

    // 3. Withdraw with balance check
    public void withdraw(String accNo, double amount) {
        if (!accounts.containsKey(accNo)) {
            System.out.println("Account not found: " + accNo);
            return;
        }

        double balance = accounts.get(accNo);

        if (amount > balance) {
            System.out.println("Insufficient balance in account: " + accNo);
        } else {
            accounts.put(accNo, balance - amount);
        }
    }

    // 4. Print sorted by descending balance
    public void printSortedAccounts() {

        System.out.println("\nAccounts sorted by balance (descending):");

        List<Map.Entry<String, Double>> list =
                new ArrayList<>(accounts.entrySet());

        list.sort((a, b) -> Double.compare(b.getValue(), a.getValue()));

        for (Map.Entry<String, Double> entry : list) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }

    // 5. Top 3 customers
    public void printTop3() {

        List<Map.Entry<String, Double>> list =
                new ArrayList<>(accounts.entrySet());

        list.sort((a, b) -> Double.compare(b.getValue(), a.getValue()));

        System.out.println("\nTop 3 Customers:");

        for (int i = 0; i < Math.min(3, list.size()); i++) {
            Map.Entry<String, Double> e = list.get(i);
            System.out.println(e.getKey() + " -> " + e.getValue());
        }
    }

    public static void main(String[] args) {

        BankSystem bank = new BankSystem();

        // 1. Add accounts
        bank.addAccount("ACC101", 5000);
        bank.addAccount("ACC102", 12000);
        bank.addAccount("ACC103", 8000);
        bank.addAccount("ACC104", 15000);
        bank.addAccount("ACC105", 3000);

        // 2. Transactions
        bank.deposit("ACC101", 2000);
        bank.withdraw("ACC103", 1000);
        bank.withdraw("ACC105", 5000); // insufficient balance

        // 3. Sorted accounts
        bank.printSortedAccounts();

        // 4. Top 3 customers
        bank.printTop3();
    }
}