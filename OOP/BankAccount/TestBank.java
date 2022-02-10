class TestBank{
    public static void main(String[] args) {
        
        BankAccount craigsAccounts = new BankAccount();
        System.out.println(craigsAccounts.getAccountNumber());

        craigsAccounts.depositMoney("checking", 2000.00);
        System.out.println(craigsAccounts.getCheckingBalance());

        craigsAccounts.withdrawMoney("Checking", 1000.00);
        System.out.println(craigsAccounts.getCheckingBalance());
        // System.out.println(BankAccount.totalBankMoney);

        BankAccount mattsAccounts = new BankAccount();
        System.out.println(craigsAccounts);

        mattsAccounts.depositMoney("checking", 2000.00);
        System.out.println(mattsAccounts.getCheckingBalance());

        mattsAccounts.withdrawMoney("checking", 1000.00);
        System.out.println(mattsAccounts.getCheckingBalance());
        // System.out.println(BankAccount.totalBankMoney);

    }
}