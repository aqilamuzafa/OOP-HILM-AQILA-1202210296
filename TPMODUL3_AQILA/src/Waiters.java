
public class Waiters implements Runnable {

    private final int orderQty;
    private final int customerID;
    static int foodPrice = 25000;

    public Waiters(int customerID, int orderQty) {
        this.customerID = customerID;
        this.orderQty = orderQty;
    }



    @Override
    public void run() {
        // call getFood method and pending it to 5000 ms
        while (true) {
            getFood();
            try {
                Thread.sleep(15000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void orderinfo() {
        System.out.println("==========================================================");
        System.out.println("Customer ID: " + this.customerID);
        System.out.println("Number of Food: " + this.orderQty);
        System.out.println("Total Price: " + this.orderQty * foodPrice);
        System.out.println("==========================================================");
    }
    // create synchronized method getFood

    public void getFood() {
        synchronized(Restaurant.getLock()) {

            System.out.println("Waiters: Food is ready to deliver");
            Restaurant foodMachine = new Restaurant();
            foodMachine.setWaitingForPickup(false);

            // check if value of getFoodNumber form FoodMachine class is equal to orderQty
            // if same, call method orderInfo() to print order info and exit the program
            if (Restaurant.getFoodNumber() == this.orderQty + 1) {
                orderinfo();
                System.exit(0);
            }
            Restaurant.getLock().notifyAll();
            System.out.println("Waiters: Tell the Restaurant to make another Food\n");

        }
    }
}