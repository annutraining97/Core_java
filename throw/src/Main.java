import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        String[] s = scanner.nextLine().split(" ");

        int a = Integer.parseInt(s[0]);
        int b = Integer.parseInt(s[1]);

        if( b == 0)
        {
            throw new  ArithmeticException("Can't perform division by 0") ;
        }
        else
        {
            System.out.println(a/b);
        }



    }
}
