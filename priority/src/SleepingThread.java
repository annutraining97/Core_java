public class SleepingThread  extends Thread{
    int n;

    public SleepingThread(int n) {
        this.n = n;
    }

    public void run()
    {
        for(int i=0; i<n;i++)
        {
            try {
                Thread.sleep(500);
            }
            catch(Exception e)
            {
                System.out.println(e);
            }
            System.out.println("This is from "+ Thread.currentThread().getName()+": "+i);
        }
    }
}
