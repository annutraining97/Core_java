public class Main {

    public static void main(String[] args) {
//        creating an object with default constructor
        Solution sol = new Solution();
//        creating an object with constructor with parameters
        Solution sol1 = new Solution(10,5);

         int a = sol.setA(1000);

        System.out.println(a+"------"+ sol1.b);
    }
}
