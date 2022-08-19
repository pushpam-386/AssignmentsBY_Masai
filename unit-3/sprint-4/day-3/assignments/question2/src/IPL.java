public class IPL {
    void homeTeamStadium(Stadium stadium){
        if (stadium==Stadium.CHIDAMBARAM_STADIUM){
            System.out.println("This is the home ground of CSK");
        }
        if (stadium==Stadium.WANKHEDE_STADIUM){
            System.out.println("This is the home ground of Mumbai Indians");
        }
        if (stadium==Stadium.EDEN_GARDENS_STADIUM){
            System.out.println("This is the home ground of KKR");
        }
        if (stadium==Stadium.M_CHINNASWAMY_STADIUM){
            System.out.println("This is the home ground of RCB");
        }
    }
}


//    If Stadium = EDEN_GARDENS_STADIUM then print “This is the home ground of KKR”
//        If Stadium = WANKHEDE_STADIUM then print “This is the home ground of Mumbai Indians”
//        If Stadium = CHIDAMBARAM_STADIUM then print “This is the home ground of CSK”
//        If Stadium = M_CHINNASWAMY_STADIUM then print “This is the home ground of RCB”