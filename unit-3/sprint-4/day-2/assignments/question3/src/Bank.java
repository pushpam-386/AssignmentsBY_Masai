public class Bank {
    private Bank(){
        System.out.println("Inside Private Constructor of Bank");
    }

    static void setBank()
    {
        Bank b = new Bank();
    }
}
