package Chapter11;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class Bank {
    private ArrayList <BankAccount> bankAccounts = new ArrayList<BankAccount>();

    public Bank() {

    }

    public void readFile(String filename) throws Exception{
        Scanner input = new Scanner(new File(filename));

        while (input.hasNextLine()) {
            String line = input.nextLine();
            int i = 0;
            while (Character.isDigit(line.charAt(i))) { i++; }
            String accountNumbersString = line.substring(0, i);
            while (Character.isWhitespace(line.charAt(i))) { i++; }
            String accountBalanceString = line.substring(i).trim();
            this.bankAccounts.add(new BankAccount(Long.valueOf(accountNumbersString), Float.valueOf(accountBalanceString)));

        }
        input.close();

    }

    public void printHighestBalanceAccount() {
        BankAccount highestBalanceAccount = null;

        for(BankAccount a: this.bankAccounts) {
            if(highestBalanceAccount == null) {
                highestBalanceAccount = a;
            }
            else if(a.getAccountBalance() > highestBalanceAccount.getAccountBalance()) {
                highestBalanceAccount = a;
            }
        }
        System.out.println("The account with the highest balance is account " + highestBalanceAccount.getAccountNumbers()
                + " with a balance of " + highestBalanceAccount.getAccountBalance());
    }

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        boolean fileGood = false;
        Bank bank = new Bank();
        while(!fileGood) {
            System.out.println("Please enter the name of the file containing the account information: ");
            String fileName = userInput.nextLine();
            try {
                bank.readFile(fileName);
                fileGood = true;
            }
            catch (Exception e) {
                System.out.println("Bad file format. Please try again.");
                fileGood = false;
            }

        }
        bank.printHighestBalanceAccount();


    }
}

class BankAccount {
    private long accountNumbers;
    private float accountBalance;

    BankAccount(long accountNumbers, float accountBalance) {
        this.accountNumbers = accountNumbers;
        this.accountBalance = accountBalance;
    }

    public long getAccountNumbers() {
        return accountNumbers;
    }

    public void setAccountNumbers(long accountNumbers) {
        this.accountNumbers = accountNumbers;
    }

    public float getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(float accountBalance) {
        this.accountBalance = accountBalance;
    }
}