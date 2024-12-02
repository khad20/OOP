import java.math.BigDecimal;

public class vendor implements Runnable {
    private int totalticket;
    private int ticketReleaseAmount;
    private ticketpool ticketpool;

    public vendor(int totalticket, int ticketReleaseAmount,ticketpool ticketpool) {
        this.totalticket = totalticket;
        this.ticketReleaseAmount = ticketReleaseAmount;
        this.ticketpool = ticketpool;
    }

    @Override
    public void run() {
        for(int i = 1; i <totalticket; i++) {
            ticket ticket = new ticket(i,"Event", new BigDecimal("1000"));
            ticketpool.addTicket(ticket);
            try{
                Thread.sleep(ticketReleaseAmount * 1000);
            } catch (InterruptedException e){
                throw new RuntimeException(e);
            }

        }
    }
}
