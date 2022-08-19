public class Main {
    public static void main(String[] args) {
        TicketCounter ticketCounter=new TicketCounter();
        TicketBooking ticketBooking1=new TicketBooking(ticketCounter,"Pushpam",2);
        TicketBooking ticketBooking2=new TicketBooking(ticketCounter,"Rohit",5);
        TicketBooking ticketBooking3=new TicketBooking(ticketCounter,"Mohit",1);
        Thread t1=new Thread(ticketBooking1);
        Thread t2=new Thread(ticketBooking2);
        Thread t3=new Thread(ticketBooking3);
        t1.start();
        t2.start();
        t3.start();
    }
}