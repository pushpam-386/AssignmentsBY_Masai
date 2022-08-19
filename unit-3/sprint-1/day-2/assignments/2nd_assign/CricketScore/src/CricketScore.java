public class CricketScore {
    public void cricketScore(int r1, int r2, int r3, int r4, int r6) {
        int total_run=(r1*1+r2*2+r3*3+r4*4+r6*6);
        System.out.println("Total run scored by a team = " + total_run);
    }

    public static void main(String[] args) {
        int r1=42;
        int r2=13;
        int r3=10;
        int r4=20;
        int r6=9;
        CricketScore obj=new CricketScore();
        obj.cricketScore(r1,r2,r3,r4,r6);
    }

}

