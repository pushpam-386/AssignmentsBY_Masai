public class InputOdd {
    int eoe;

    public void setEoe(int eoe) {
        if(eoe%2!=0 && eoe>0){
            System.out.println(eoe);
        }
        else if(eoe<0){
            System.out.println("Error");
        }
        else if(eoe%2==0){
            int div=eoe/10;
            div++;
            int res=div*10;
            System.out.println(res);
        }
    }

    public static void main(String[] args) {
        InputOdd obj1=new InputOdd();
        InputOdd obj2=new InputOdd();
        InputOdd obj3=new InputOdd();
        obj1.eoe=23;
        obj2.eoe=28;
        obj3.eoe=-1;

        obj1.setEoe(obj1.eoe);
        obj1.setEoe(obj2.eoe);
        obj1.setEoe(obj3.eoe);
    }
}
