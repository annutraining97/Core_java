import java.util.Scanner;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter a positive integer for 'n': ");
        int n = scanner.nextInt();

        SleepingThread sleep = new SleepingThread(n);
        SleepingThread sleep_1 = new SleepingThread(n);
        SleepingThread sleep_2 = new SleepingThread(n);
        sleep.setName("Thread_1");
        sleep_1.setName("Thread_2");
        sleep_2.setName("Thread_3");
//        sleep.setPriority(Thread.MIN_PRIORITY);
//        sleep_1.setPriority(Thread.MAX_PRIORITY);
        sleep.start();
        sleep_1.start();
        sleep_2.start();
    }
}