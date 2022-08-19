import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Mobile {
    HashMap<String, ArrayList<String>> mobiles = new HashMap<>();

    public String addMobile(String company, String model){
       if (mobiles.containsKey(company)){
           mobiles.get(company).add(model);
       }
       else {
           ArrayList<String> models=new ArrayList<>();
           models.add(company);
           mobiles.put(company,models);
       }
       return "Mobile added Successfully";
    }

    public List<String> getModels(String company)throws InvalidMobileException {
        if(mobiles.containsKey(company)){
            return mobiles.get(company);
        }
        throw new InvalidMobileException();
    }

    public static void main(String[] args) {
        Mobile mobile=new Mobile();
        mobile.addMobile("Samsung","Galaxy");
        mobile.addMobile("Samsung","Wave");
        mobile.addMobile("Samsung","Arm");
        mobile.addMobile("Nokia","World");

        try {
            List<String> model=mobile.getModels("Samsung");
            System.out.println(model.toString());
            List<String> models2=mobile.getModels("Oneplus");
        }
        catch (InvalidMobileException e){
            System.out.println("Invalid Mobile Exception");
        }
    }
}
