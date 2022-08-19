public class TicketBooking implements Runnable{
    private TicketCounter ticketCounter;
    private String passengerName;
    private int noOfSeatsToBook;

    public TicketBooking(TicketCounter ticketCounter, String passengerName, int noOfSeatsToBook) {
        this.ticketCounter = ticketCounter;
        this.passengerName = passengerName;
        this.noOfSeatsToBook = noOfSeatsToBook;
    }

    @Override
    public void run() {
        TicketCounter ticketCounter1=new TicketCounter();
        try {
            ticketCounter1.bookSeat(this.passengerName,this.noOfSeatsToBook);
        } catch (NoSeatAvailableException e) {
            System.out.println(e.getMessage());
        }
    }
}
