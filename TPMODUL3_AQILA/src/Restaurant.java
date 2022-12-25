

public class Restaurant implements Runnable {

    private boolean waitingForPickup = false;
    private static final Object lock = new Object();
    private static int foodnumber = 1;

    @Override
    public void run() {
        while (true) {
            makeFood();
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void setWaitingForPickup(boolean waitingForPickup) {
        this.waitingForPickup = waitingForPickup;
    }

    public static int getFoodNumber() {
        return foodnumber;
    }

    public void makeFood() {
        synchronized(Restaurant.lock) {
            // check if waitingForPickup is true so call method lock.wait() to lock for thread
            // so process not to continue before waiters deliver food
            if (this.waitingForPickup) {
                try {
                    System.out.println("Restaurant: Waiting for the Waiters to deliver the food");
                    Restaurant.lock.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            // to inform another thread that another food is ready to deliver
            waitingForPickup = true;
            System.out.println("Restaurant:  Making Food Number " + foodnumber++);
            Restaurant.lock.notifyAll();
            System.out.println("Restaurant: Telling the Waiters to get the food\n");
        }
    }

    public static Object getLock() {
        return lock;
    }
}