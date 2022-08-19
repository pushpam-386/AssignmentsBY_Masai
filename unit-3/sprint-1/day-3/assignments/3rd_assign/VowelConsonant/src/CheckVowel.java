public class CheckVowel {
    static String small="abcdefghijklmnopqrstuvwxyz";
    static String large="ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    char alph;
     static String message="invalid Charactar";

    public void check(char alph){
        int count=0;
        for(int i=0;i<26;i++){
            if(small.charAt(i)==alph||large.charAt(i)==alph){
               count++;
            }
        }
        if(count>0){
            if(alph=='a'||alph=='e'||alph=='i'||alph=='o'||alph=='u'||alph=='A'||alph=='E'||alph=='I'||alph=='O'||alph=='U'){
                System.out.println("Vowel");
            }
            else{
                System.out.println("Consonant");
            }
        }
        else{
            System.out.println(message);
        }
    }

    public static void main(String[] args) {
        CheckVowel obj1=new CheckVowel();
        CheckVowel obj2=new CheckVowel();
        CheckVowel obj3=new CheckVowel();

        obj1.alph='d';
        obj2.alph='I';
        obj3.alph='4';

        obj1.check(obj1.alph);
        obj2.check(obj2.alph);
        obj3.check(obj3.alph);
    }
}
