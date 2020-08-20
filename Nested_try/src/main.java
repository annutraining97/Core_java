import java.util.Scanner;

public class main {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

            String[] s = scanner.nextLine().split(" ");
            int[] arr = new int[5];
            for(int i=0;i<arr.length;i++) {
                try
                {

                try {
                    arr[i] = Integer.parseInt(s[i]);


                } catch (NumberFormatException e) {
                    System.out.println("Handled by inner TRY---->Number format");

                }
            }
                catch (ArrayIndexOutOfBoundsException e)
                {
                    System.out.println("Handled by outer TRY-------->Array out of the bound");

                }
        }

    }
}

//   input:   Nested_try_block
