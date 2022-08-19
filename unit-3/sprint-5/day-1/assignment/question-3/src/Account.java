public class Account {
    String accountNumber;
    double balance=0;

    public Account(String accountNumber){
        this.accountNumber=accountNumber;
    }

    public  void deposit(double amount){
        balance=balance+amount;
    }
    public  double withdraw(double amount) throws InsufficientFundsException {
        if(amount<=balance){
            System.out.println("withdrawal is Possible. ");
            double ba=balance-=amount;
            return ba;
        }
        else{
            InsufficientFundsException ife=new InsufficientFundsException("InsufficientFundException");
            throw ife;
        }
    }

}
