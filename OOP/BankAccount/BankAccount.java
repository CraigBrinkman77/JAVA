import java.util.Random;
class BankAccount{
    private double checkingBalance = 0.0;
    private double savingsBalance = 0.0;
    private int accountNumber;
    
    //counting total number of Bankaccount
    private static double numberOfAccounts = 0.0;
    private static double totalBankMoney = 0.0;

    public BankAccount(){
        this.accountNumber = setAccountNumber();
        addToNumberOfAccounts();
    }

    // Deposits
    public void depositMoney(String accountType, Double depositAmmount) {
        // if(user){
        //     only admin access
        // }
        if(accountType.toLowerCase() == "checking"){
        this.checkingBalance += depositAmmount;
        this.totalBankMoney += depositAmmount;
        }else if(accountType.toLowerCase() == "savings"){
        this.savingsBalance += depositAmmount;
        this.totalBankMoney += depositAmmount;
        }
    }

    //Withdraw
    public void withdrawMoney(String accountType, Double withdrawAmmount) {
        if(accountType.toLowerCase() == "checking" && this.getCheckingBalance() > withdrawAmmount){
            this.checkingBalance -= withdrawAmmount;
        }
        else if(accountType.toLowerCase() == "savings" && this.getSavingsBalance() > withdrawAmmount){
            this.savingsBalance -= withdrawAmmount;
        }
        else{
            System.out.println("Not Enough Funds");
        }
        this.totalBankMoney -= withdrawAmmount;
    }

    private int setAccountNumber(){
        int randomNumber =  new Random().nextInt(2147483645) + 1000000000;
            System.out.println("new random" + randomNumber);

        return randomNumber;
    }
    public void addToNumberOfAccounts(){
        numberOfAccounts ++;
    }
    // get Checking
    public Double getCheckingBalance() {
        return this.checkingBalance;
    }
    
    //get Savings
    public Double getSavingsBalance() {
        return this.savingsBalance;
    }
    //get accountNumber
    public int getAccountNumber(){
        return this.accountNumber;
    }
    // total user money
    public Double getTotalUserMoney(){
        return (this.checkingBalance + this.savingsBalance);
    }
}