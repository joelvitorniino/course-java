package entities;

public class AccountBank {
    private int accountNumber;
    private String accountHolder;
    private double accountBalance;

    public AccountBank(int accountNumber, String accountHolder, double accountBalance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.accountBalance = 0;
        this.accountBalance = accountBalance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void depositAccountBalance(double depositValue) {
        this.accountBalance += depositValue;
    }

    public void withdrawAccountBalance(double withdrawValue) {
        this.accountBalance -= 5;
        this.accountBalance -= withdrawValue;
    }
}
