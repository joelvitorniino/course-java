package Exercises;
import entities.AccountBank;

import java.util.Scanner;

public class Exercise24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char resp;

        do {
            System.out.println("Enter account number: ");
            int accountNumber = sc.nextInt();

            System.out.println("Enter account holder: ");
            String accountHolder = sc.next();

            System.out.println("Is there na initial deposit (y/n)? ");
            resp = sc.next().charAt(0);

            System.out.println("Enter initial deposit value: ");
            double accountBalance = sc.nextDouble();

            AccountBank accountBank = new AccountBank(accountNumber, accountHolder, accountBalance);

            System.out.println();

            System.out.println("Account data: ");
            System.out.printf("Account %d, Holder: %s, Balance: $ %.2f%n", accountBank.getAccountNumber(), accountBank.getAccountHolder(), accountBank.getAccountBalance());

            System.out.println();

            System.out.println("Enter a deposit value: ");
            double depositValue = sc.nextDouble();
            accountBank.depositAccountBalance(depositValue);

            System.out.println("Updated account data:");
            System.out.printf("Account %d, Holder: %s, Balance: $ %.2f%n", accountBank.getAccountNumber(), accountBank.getAccountHolder(), accountBank.getAccountBalance());

            System.out.println();

            System.out.println("Enter a withdraw value: ");
            double withdrawValue = sc.nextDouble();
            accountBank.withdrawAccountBalance(withdrawValue);

            System.out.println("Updated account data: ");
            System.out.printf("Account %d, Holder: %s, Balance: $ %.2f%n", accountBank.getAccountNumber(), accountBank.getAccountHolder(), accountBank.getAccountBalance());
        } while (resp != 'n');
    }
}