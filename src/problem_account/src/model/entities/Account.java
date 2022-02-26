package problem_account.src.model.entities;

import problem_account.src.model.exceptions.AccountException;

public class Account {
    private Integer number;
    private String holder;
    private Double balance;
    private Double withdrawLimit;

    public Account() {
    }

    public Account(Integer number, String holder, Double balance, Double withdrawLimit) {
        this.number = number;
        this.holder = holder;
        this.balance = balance;
        this.withdrawLimit = withdrawLimit;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public Double getBalance() {
        return balance;
    }

    public Double getWithdrawLimit() {
        return withdrawLimit;
    }

    public void setWithdrawLimit(Double withdrawLimit) {
        this.withdrawLimit = withdrawLimit;
    }

    public void deposit(Double amount) {
        this.balance += amount;
    }

    public void withdraw(Double amount) throws AccountException {
        if(amount >= withdrawLimit) {
            throw new AccountException("The amount exceeds withdraw limit");
        }

        if(amount >= balance) {
            throw new AccountException("Not enough balance");
        }

        this.balance -= amount;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append("New balance: " + String.format("%.2f", getBalance()));

        return sb.toString();
    }
}
