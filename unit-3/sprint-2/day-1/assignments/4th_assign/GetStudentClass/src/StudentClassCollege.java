public class StudentClassCollege {
    int roll;
    public int getRoll() {
        return roll;
    }
    public void setRoll(int roll) {
        this.roll = 1501386;
    }

    String address;
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = "Bhubeshwar";
    }

    String name;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name ="Pushpam";
    }

    String collegeName;
    public String getCollegeName() {
        return collegeName;
    }
    public void setCollegeName(String collegeName) {
        this.collegeName ="KIIT";
    }

    public StudentClassCollege() {
    }

    public StudentClassCollege(int roll,String collegeName,String address,String name){
        this.roll = roll;
        this.collegeName = collegeName;
        this.address = address;
        this.name = name;
    }


    public void showDetails(){
        System.out.println("Roll is :"+roll);
        System.out.println("Name is :"+name);
        System.out.println("Marks is :"+address);
        System.out.println("Marks is :"+collegeName);
    }

}
