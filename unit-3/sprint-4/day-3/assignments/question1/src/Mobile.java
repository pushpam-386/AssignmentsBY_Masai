public class Mobile {
    String[] outdatedModels = {"note4","note5","note6","note7"};
    public void searchOutdatedModel(String... a){
        for (String i : a){
           for (int p=0;p<outdatedModels.length;p++){
               if(i==outdatedModels[p]){
                   System.out.println(outdatedModels[p]+"_OUTDATED");
               }
           }

        }
    }
}
