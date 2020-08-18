public class Solution implements Solution1
{
    int b = 10;
    public int add(int a)
    {
        b = b +  a;
        return b;
    }

    @Override
    public int mul(int a) {
        b = b*a;
        return b;
    }
}
