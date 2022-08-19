public class AccountDemo {
    public static void main(String[] args)  {
        Account account=new Account("123456789");
        System.out.println("Account no. :-  "+account.accountNumber);

        account.deposit(1000);

        try{
        double balance=account.withdraw(1200);
            System.out.println("Current Balance: "+balance);
        }
        catch (InsufficientFundsException insufficientFundsException){
//            System.out.println(insufficientFundsException.getMessage());
            insufficientFundsException.printStackTrace();
        }
    }
}
