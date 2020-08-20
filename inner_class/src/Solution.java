public class Solution {

    int a = 100;
    int b = 100;

    class inner_solution {
        int sum()
        {
//             this is to prove inner class can use the variables ideclared in the outer class
            return a+b;
        }

    }
}
