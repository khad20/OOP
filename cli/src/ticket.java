import java.math.BigDecimal;

public class ticket {
    private int ticketid;
    private String ticketname;
    private BigDecimal ticketprice;

    public ticket(int ticketid, String ticketname, BigDecimal ticketprice) {
        this.ticketid = ticketid;
        this.ticketname = ticketname;
        this.ticketprice = ticketprice;
    }
    public int getTicketid() {
        return ticketid;
    }
    public void setTicketid(int ticketid) {
        this.ticketid = ticketid;
    }
    public String getTicketname() {
        return ticketname;
    }
    public void setTicketname(String ticketname) {
        this.ticketname = ticketname;
    }
    public BigDecimal getTicketprice() {
        return ticketprice;
    }
    public void setTicketprice(BigDecimal ticketprice) {
        this.ticketprice = ticketprice;
    }
    @Override
    public String toString() {
        return "ticket{" + "ticketid=" + ticketid + ", ticketname=" + ticketname + ", ticketprice=" + ticketprice + '}';
    }

}
