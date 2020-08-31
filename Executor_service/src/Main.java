import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {
        CountDownLatch latch1 = new CountDownLatch(5);
        CountDownLatch latch2 = new CountDownLatch(5);
        CountDownLatch latch3 = new CountDownLatch(5);
        CountDownLatch latch4 = new CountDownLatch(5);
        ExecutorService service = Executors.newFixedThreadPool(1);
        System.out.println("Process is starting");

        service.execute(new New_Thread("Thread 1", latch1));
        service.execute(new New_Thread("Thread 2", latch2));
        service.execute(new New_Thread("Thread 3", latch3));
        service.execute(new New_Thread("Thread 4", latch4));
//        System.out.println("SHUT DOWN");
        try {
            latch1.await();
            System.out.println("latch 1 is waiting for other threads to complete");
            latch2.await();
            System.out.println("latch 2 is waiting for other threads to complete");

            latch3.await();
            System.out.println("latch 3 is waiting for other threads to complete");

            latch4.await();
            System.out.println("latch 4 is waiting for other threads to complete");


        }catch(InterruptedException e)
        {
            System.out.println(e);
        }
//        System.out.println("SHUT DOWN");
        if(!service.isShutdown())
        {
            System.out.println("JVM is still running");

        }

        service.shutdown();
        System.out.println("SHUT DOWN");




    }
}
