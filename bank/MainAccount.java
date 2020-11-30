package bank;

public class MainAccount 
{
    public static void main(String args[])
    {
        BankAccount mineAccount = new BankAccount(1000.00);
        BankAccount mineAccount2 = new BankAccount(1000.00);

        mineAccount.setHolder("Leonardo");
        mineAccount.setOpeningDate(30, 11, 2020);

        mineAccount.deposit(100);
        String data = mineAccount.printData();
        
        System.out.println(data);
        System.out.println("Total of open accounts: " + BankAccount.getNumberOfAccounts());
    }
}
