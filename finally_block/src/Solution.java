public class Solution {

    public void finally_block(int[] arr)
    {
        int min = Integer.MAX_VALUE;
        try
        {
            for(int i=0; i<arr.length;i++)
            {
                if(min>arr[i])
                {
                    min = arr[i];

                }
            }

            for(int i=0; i<arr.length;i++)
            {
//                System.out.println(arr[i]+"----"+min);
                arr[i] /=min;
//                System.out.println(arr[i]+"----"+min);
            }



        }
        catch(ArithmeticException e)
        {
            min = Integer.MAX_VALUE;
            for(int i=0; i<arr.length;i++)
            {
                if(min>arr[i] && arr[i]!=0)
                {

                    min = arr[i];
                }
            }
            System.out.println("Arithmetic exception occurred and it's handled now" );

        }

        finally {
            for(int i=0; i<arr.length;i++)
            {
                arr[i] /=min;
                System.out.println(arr[i]);
            }

        }
    }



}
