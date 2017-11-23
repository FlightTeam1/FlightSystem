package threads;


import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class threadFlying {

	ExecutorService service = Executors.newFixedThreadPool(1);
	
	public threadFlying() {
		// TODO Auto-generated constructor stub
	}
	
	public static void main() {
		ExecutorService fixedPool = Executors.newFixedThreadPool(1);
		 
        // Create a Callable object of anonymous class
        Callable<String> aCallable = new Callable<String>(){
            String result = "Callable done !";
            @Override
            public String call() throws Exception {
                // Print a value
                System.out.println("Callable at work !");
                // Sleep for 5 sec
                Thread.sleep(5 * 1000);
                return result;
            }
        };
 
        // Create a Runnable object of anonymous class
        Runnable aRunnable = new Runnable(){
            @Override
            public void run() {
                try {
                    // Print a value
                    System.out.println("Runnable at work !");
                    // Sleep for 5 sec
                    Thread.sleep(5 * 1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
 
	}
}
