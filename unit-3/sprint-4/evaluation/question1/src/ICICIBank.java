public class ICICIBank extends Bank{
    private double rateOfInterest;

    public ICICIBank(String branchName, String ifscCode,double rateOfInterest) {
        super(branchName,ifscCode);
        this.rateOfInterest=rateOfInterest;
    }

    @Override
    void displayDetails(){
       super.displayDetails();
        System.out.println("Rate Of Interest:"+rateOfInterest);
    }
}
