package Day16;
import java.util.ArrayList;
import java.util.Collections;

class ProductThread extends Thread {
    private String taskName;

    public ProductThread(String taskName) {
        this.taskName = taskName;
    }

    @Override
    public void run() {
        for(int i=1; i<=3; i++) {
            System.out.println(taskName + " - iteration " + i);

            // Demonstrate yield
            if(i == 2) {
                System.out.println(taskName + " yielding...");
                Thread.yield();
            }

            try {
                // Demonstrate sleep
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(taskName + " interrupted!");
            }
        }
        System.out.println(taskName + " finished.");
    }
}

public class Products {

    public static void main(String[] args) {
        ArrayList<String> products = new ArrayList<>();

        products.add("CPU");
        products.add("MONITOR");
        products.add("HARDDISK");
        products.add("Keyboard");
        products.add("MOUSE");

        Collections.sort(products, Collections.reverseOrder());
        System.out.println("Sorted product names:");

        for(String product: products) {
            System.out.println(product);
        }

        // Create threads
        ProductThread t1 = new ProductThread("Thread-1");
        ProductThread t2 = new ProductThread("Thread-2");
        ProductThread t3 = new ProductThread("Thread-3");

        // Set priorities
        t1.setPriority(Thread.MIN_PRIORITY);   // Lowest priority
        t2.setPriority(Thread.NORM_PRIORITY);  // Normal priority
        t3.setPriority(Thread.MAX_PRIORITY);   // Highest priority

        // Start threads
        t1.start();
        t2.start();
        t3.start();

        try {
            // Demonstrate join
            t1.join();
            t2.join();
            t3.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted!");
        }

        System.out.println("All threads have completed. Main thread exiting.");
    }
}
