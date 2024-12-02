import java.util.LinkedList;
import java.util.Queue;

public class ticketpool {
    private int maxTicketCapacity;
    private Queue<ticket> tickets;
    public ticketpool( int maxTicketCapacity ) {
        this.maxTicketCapacity = maxTicketCapacity;
        tickets = new LinkedList<ticket>();
    }
    public synchronized void addTicket( ticket ticket ) {
        while (tickets.size() > maxTicketCapacity) {
            try{
                wait();
            }catch( InterruptedException e ) {
                e.printStackTrace();
                throw new RuntimeException( e.getMessage() );
            }
        }
        this.tickets.add( ticket );
        notifyAll();
        System.out.println("Ticket added by- " + Thread.currentThread().getName()+ "- current size is -" + tickets.size() );
    }
    public synchronized ticket getTicket() {
        while (tickets.isEmpty()) {
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e.getMessage());
            }
        }

        ticket ticket = tickets.poll();
        notifyAll();
        System.out.println("ticket bought by -" + Thread.currentThread().getName() + "- current size is -" + tickets.size() + "- ticket is -" + ticket);
        return ticket;
    }
}
