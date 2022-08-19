public class AxisBank extends Bank{
    double rateOfInterest;

    public AxisBank(String branchName, String ifscCode,double rateOfInterest){
        super(branchName,ifscCode);
        this.rateOfInterest=rateOfInterest;
    }

    @Override
    public void displayDetails(){
        super.displayDetails();
        System.out.println(rateOfInterest);
    }

    public void getCreditCard(){
        System.out.println("Get the Credit Card from the Axis bank");
    }
}
