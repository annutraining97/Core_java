abstract class thread extends Thread{
    int n;
    public thread(int n) {
        this.n = n;
    }

    @Override

    public  void run() {
//        super.run();

    }

   abstract void printable();
}

public class Sync extends thread{
//    thread t_1 = new thread(100);


    public Sync(int n) {
        super(n);
    }

   public synchronized void printable()
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
           System.out.println("This is from "+ Thread.currentThread().getName()+": "+i*n);
       }
   }

    @Override
    public  void run() {
        super.run();
        printable();
    }
}
