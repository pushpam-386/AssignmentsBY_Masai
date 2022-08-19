public class Bank {
    private String branchName;
    private String ifscCode;

    public Bank(String branchName,String ifscCode){
        this.branchName=branchName;
        this.ifscCode=ifscCode;
    }


    void displayDetails(){
         System.out.println("Branch Name:"+branchName);
         System.out.println("Ifsc Code:"+ifscCode);
     }
}
