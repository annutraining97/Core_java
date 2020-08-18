public class Main {
    public static void main(String[] args) {
//        creating an instance of class solution
        Solution sol = new Solution();

//        calling the method with 2 parameters
        int sum = sol.arithmetic_prob(15,10);

//        calling the same method with 3 parameters
        int mul = sol.arithmetic_prob(10, 5, 20);


        System.out.println(sum+"-----------"+mul);
    }
}
