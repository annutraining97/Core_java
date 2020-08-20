public class Main {
    public static void main(String[] args) {
        int a =10;
        int b =20;
        Solution sol = new Solution() {
            @Override
            int sum(int a, int b) {
                return a+b;
            }
        };
        int sum = sol.sum(a,b);
        System.out.println(sum);
    }
}
