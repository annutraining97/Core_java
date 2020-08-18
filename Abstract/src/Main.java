public class Main {
    public static void main(String[] args) {

//        Abstract class instance
        Abstract1 abs = new Solution(10,5);
        System.out.println(abs.sum());
//        Abstract method instance
        Solution sol = new Solution(10,5);
        System.out.println(sol.mul(sol.a, sol.b));
    }
}
