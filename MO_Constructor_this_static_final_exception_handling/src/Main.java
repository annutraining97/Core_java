public class Main {
    public static void main(String[] args) {
//        calling static method without creating an instance of the class
        int sum = Solution.sum(10,10);
//        creating the instance
        Solution sol = new Solution();
        System.out.println(sum);
        sol.div(0);
//        sol.div(a);



    }
}
