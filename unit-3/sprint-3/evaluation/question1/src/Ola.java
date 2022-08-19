public class Ola {
    public Car bookCar(int numberOfPassenger,int numberOfKms){
        if(numberOfPassenger<=3){
            HatchBack hatchBack=new HatchBack();
            hatchBack.setNumberOfPassengers(numberOfPassenger);
            hatchBack.setNumberOfKms(numberOfKms);
            return hatchBack;
        }
        Sedan sedan=new Sedan();
        sedan.setNumberOfKms(numberOfKms);
        sedan.setNumberOfPassengers(numberOfPassenger);
        return sedan;
    }
    public int calculateBill(Car car){
        int farePerkm;
        if(car instanceof Sedan){
            Sedan sedan =new Sedan();
            farePerkm=sedan.getFarePerKm();
        }
        else{
            HatchBack hatchBack=new HatchBack();
            farePerkm=hatchBack.getFarePerKm();
        }
        return car.getNumberOfKms()*farePerkm;
    }

}
