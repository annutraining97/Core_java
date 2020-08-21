import java.util.Scanner;

public class main {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter a positive integer for 'n': ");
        String[] n = scanner.nextLine().split(" ");

        Sync sync = new Sync(Integer.parseInt(n[0]));
        Sync sync_1 = new Sync(Integer.parseInt(n[1]));

        sync.start();
        sync_1.start();


    }
}