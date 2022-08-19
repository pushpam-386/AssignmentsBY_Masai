import java.util.Scanner;
public class Demo {
    public static Bank getBank(String bank) {
        if(bank.equals("axis")){
            return new AxisBank("patna","789",9.8);

        }
        else if(bank.equals("icici")){
            return new ICICIBank("delhi","888",9.2);

        }
        return null;

    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Bank Details:");
        System.out.println("Enter branchName:");
        String branch=sc.next();
        Bank bank=getBank(branch);
        try {
            bank.displayDetails();
            if (bank instanceof AxisBank) {
                ((AxisBank) bank).getCreditCard();
            }
        }
            catch(Exception e){
                System.out.println("Invalid Bank");
            }


        }

    }

