public class Main {
    public static void main(String[] args) {
        ticketpool ticketpool = new ticketpool(10);

        vendor[] vendors = new vendor[10];
        for (int i = 0; i < vendors.length; i++) {
            vendors[i] = new vendor(20,5,ticketpool);
            Thread vendorThread = new Thread(vendors[i],"vendors ID -" + i);
            vendorThread.start();
        }

        customer[] customers = new customer[10];
        for (int i = 0; i < customers.length; i++) {
            customers[i] =new customer(ticketpool,6,5);
            Thread customerThread = new Thread(customers[i],"customers ID -" + i);
            customerThread.start();
        }
    }
}