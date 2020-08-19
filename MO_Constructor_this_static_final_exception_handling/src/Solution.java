public class Solution {
    int a;
//    final keyword
    final int b = 100;

//    default constructor
    public Solution() {
    }

    public Solution(int a) {
//        this keyword
        this.a = a;
    }

    static int sum(int a, int c)
    {
//        b =
        return a+c;
    }

    int div(int a)
    {

        try {
            return b/a;
        }
        catch(ArithmeticException e)
        {
            System.out.println("Cannot divide by zero");
            return 0;
        }
        catch (Exception e )
        {
            System.out.println(e);
            return 0;
        }
    }
}
