import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] s = scanner.nextLine().split(" ");
        int[] arr = new int[5];
        for(int i=0; i< arr.length;i++)
        {
            arr[i] = Integer.parseInt(s[i]);
        }
        Solution sol = new Solution();
        sol.multi_catch(arr);
//        inputs: 16 0 67 89 34
//                16 40 67 89 34
//
    }
}
