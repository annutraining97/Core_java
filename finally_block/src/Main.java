import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String[] s = scanner.nextLine().split(",");
        int[] arr = new int[5];
        for(int i =0; i<arr.length;i++)
        {
            arr[i] = Integer.parseInt(s[i]);

        }
        Solution sol = new Solution();
        sol.finally_block(arr);
    }
//   Include 0 in the input, and input should contain 5 integers seperated by ","
}
