public class Solution {
    public void multi_catch(int[] arr)
    {

        try
        {
            int min = min_arr(arr);

            for(int i =0; i<arr.length;i++)
            {

                arr[i] = arr[i+1]/ min;
            }
        }
        catch(ArithmeticException e)
        {
            System.out.println("Division operation can't be performed by 0");
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Array index out of bound");
        }







    }

    public int min_arr(int[] arr)
    {
        int min =Integer.MAX_VALUE;
        for(int i =0; i<arr.length;i++)
        {
            if(min>arr[i])
            {
                min = arr[i];
            }
        }
        return min;

    }

}
