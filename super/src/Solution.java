public class Solution  extends Parent{
    int a = 30;
    int b = 40;
//    using parent method


    public Solution() {
    }

//    public Solution(int a, int b, int a1, int b1) {
//        super(a, b);
//        this.a = a1;
//        this.b = b1;
//        System.out.println(a+"-----"+ b +"-----"+ a1 +"-----"+b1);
//    }

    public int sum (int a, int b)
    {
        return a+b;
    }

    public void working()

    {

        int sum_child = sum(a, b);
//    using super to invoke parent variable
        int sum_parent_variable = sum(super.a, b);

//     using super to invoke parent method

        int mul = super.sum(a,b);

        System.out.println(sum_child+"------"+sum_parent_variable+"----"+mul);


    }

}
