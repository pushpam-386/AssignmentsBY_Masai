public class TicketCounter {
    private int availableSeats = 3;
    public void bookSeat(String name, int numberOfSeats) throws NoSeatAvailableException {
        if(numberOfSeats>this.availableSeats){
            throw new NoSeatAvailableException("Seats Are Not Available");
        }

        this.availableSeats=this.availableSeats-numberOfSeats;
        System.out.println(numberOfSeats+"-->"+"Seats Booked");
    }
}
