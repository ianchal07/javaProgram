import java.util.Scanner;
class Account {
    int accNo;
    String name,address,phoneNo,dob;
    int balance;

    Account(int accNo,String name, String address,String phoneNo,String dob,int balance) {
        this.accNo = accNo;
        this.name = name;
        this.address = address;
        this.phoneNo = phoneNo;
        this.dob = dob;
        this.balance = balance;
    }

    public int getAccountNumber() {
        return accNo;
    }

    public void setAccountNumber(int accountNumber) {
        this.accNo = accountNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    void closeAccount() {
        System.out.println("Account Closed.");
    }

    @Override
    public String toString() {
        return "Account Number : "+this.getAccountNumber()
                +"\nCustomer Name : "+this.getName()
                +"\nCustomer Address : "+this.getAddress()
                +"\nMobile No. : "+this.getPhoneNo()
                +"\nDate of Birth : "+this.getDob()
                +"\nAvailable Balance : "+this.getBalance();
    }


}

// create savings account class that inherits account class
class SavingsAccount extends Account{
    SavingsAccount(int accNo, String name, String address, String phoneNo, String dob, int balance) {
        super(accNo, name, address, phoneNo, dob, balance);
    }

    void withdraw(int amount) {
        balance-=amount;
        System.out.println("Withdraw Amount = "+amount);
        System.out.println("Remaining Balance = " + balance);
    }

    void deposit(int amount) {
        balance+=amount;
        System.out.println("Deposit Amount = "+amount);
        System.out.println("Available Balance = " + balance);
    }

    void fixedDeposit() {
        System.out.println("Nothing fixed deposited yet.");
    }

}

// create loan account class that inherits account class
class LoanAccount extends Account {

    LoanAccount(int accNo, String name, String address, String phoneNo, String dob, int balance) {
        super(accNo, name, address, phoneNo, dob, balance);
    }

    void payEMI(int amount) {
        balance-=amount;
        System.out.println("Deposit Amount = "+amount);
        System.out.println("Remaining loan balance = " + balance);
    }

    void toUpLoan(int amount) {
        balance+=amount;
        System.out.println("Requested Amount for loan = "+amount);
        System.out.println("Remaining loan amount to pay : " + balance);
    }

    void rePayment() {
        System.out.println("Repay your loan balance");
    }

}

public class InheritanceTask {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // creating savings account object
        SavingsAccount savingsAccount = new SavingsAccount(701,"Alex","LA","9893611410","01-12-1999",50000);
        System.out.println(savingsAccount);
        savingsAccount.deposit(700000);
        savingsAccount.withdraw(8000);
        savingsAccount.fixedDeposit();


        System.out.println();
        // creating loan account object
        LoanAccount loanAccount = new LoanAccount(702,"Adam","ON","9131344777","01-05-1999",10000);
        System.out.println(loanAccount);
        loanAccount.payEMI(8000);
        loanAccount.toUpLoan(10000);
        loanAccount.rePayment();




    }
}