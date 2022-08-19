public class Employee {
    int count=4;
    int age[]={1,2,3,4};

    public double calculateAverage(int[] age){
        double tot=0;
        double avg=0;
        if(age.length-1>=2){
            for(int i=0;i<count-1;i++){
                tot+=age[i];
            }
            return avg=tot/count;

        }
        else {
            return 0;
        }

    }

    public static void main(String[] args) {
        Employee obj=new Employee();
        if(obj.calculateAverage(obj.age)==0){
            System.out.println("Please enter a valid employee count");
        }
        else{
            System.out.println("Avg age of Employee:"+obj.calculateAverage(obj.age));
        }
    }

}
