public class Main {
    public static void main(String[] args){
        Loan loan=new Loan();

        double permanentEmployee=loan.calculateLoanAmount(new PermanentEmployee(1,"Name1",1000));
        double temporaryEmployee=loan.calculateLoanAmount(new TemporaryEmployee(2,"Name2",20,100));

        System.out.println("Loan Amount for Permanent Employee =>"+permanentEmployee);
        System.out.println("Loan Amount for Temporary Employee =>"+temporaryEmployee);

    }
}