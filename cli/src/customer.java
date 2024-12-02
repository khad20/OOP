public class customer implements Runnable {
    private ticketpool ticketpool;
    private int customerReturnAmount;
    private int quantity;

    public customer(ticketpool ticketpool, int customerReturnAmount, int quantity) {
        this.ticketpool = ticketpool;
        this.customerReturnAmount = customerReturnAmount;
        this.quantity = quantity;
    }
    @Override
    public  void run(){
        for(int i=0; i<quantity; i++){
            ticket ticket = ticketpool.getTicket();
            System.out.println("ticket is -"+ ticket + "- customer name is -" + Thread.currentThread().getName());
            try{
                Thread.sleep(customerReturnAmount * 1000);
            }catch (InterruptedException e){
                throw new RuntimeException(e);
            }
        }
    }
}
