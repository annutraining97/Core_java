import java.util.concurrent.CountDownLatch;

public class New_Thread implements Runnable{
    String name;
    CountDownLatch latch;

    public New_Thread(String name, CountDownLatch latch) {
        this.name = name;
        this.latch = latch;
    }

    @Override
    public void run() {
        for(int i =0; i< 5;i++)
        {
            System.out.println(name+": "+i+" latched for "+latch.getCount());
            latch.countDown();
        }

    }
}
