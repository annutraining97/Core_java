public class Solution {
    static String timeInWords(int h, int m) {

        String[] number_literals = new String[]{"one", "two", "three" , "four","five","six","seven","eight","nine","ten","eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","nineteen","twenty","quarter","half"};

        String[] conjunction = new String[]{"past", "to"};

//        String result;

        StringBuilder timeInWords  = new StringBuilder();
        if(m==0)
        {
            timeInWords.append(number_literals[h-1]);
            timeInWords.append(" o' clock");
        }
        else if(m==30)
        {
            timeInWords.append(number_literals[21]);
            timeInWords.append(" ");
            timeInWords.append(conjunction[0]);
            timeInWords.append(" ");
            timeInWords.append(number_literals[h-1]);
        }
        else if(m < 30)
        {
             timeInWords = efficiency(timeInWords,0,m,number_literals,conjunction,h);

        }
        else if(m>30)
        {
            int temp = 60 - m;

            timeInWords = efficiency(timeInWords,1,temp,number_literals,conjunction,h);



        }



        String result = timeInWords.toString();
        return result;

    }

    static StringBuilder efficiency(StringBuilder timeInWords, int conj, int temp, String[] number_literals, String[] conjunction, int h)
    {
        if(conj == 0)
        {
            h--;
        }
        if(temp == 15)
        {
            timeInWords.append(number_literals[20]);
            timeInWords.append(" ");
            timeInWords.append(conjunction[conj]);
            timeInWords.append(" ");
            timeInWords.append(number_literals[h]);
        }
        else if(temp < 21 && temp!=15)
        {
            timeInWords.append(number_literals[temp-1]);
            timeInWords.append(" ");
            timeInWords.append("minute");
            if(temp!=1)
            {
                timeInWords.append("s");
            }
            timeInWords.append(" ");
            timeInWords.append(conjunction[conj]);
            timeInWords.append(" ");
            timeInWords.append(number_literals[h]);


        }
        else if(temp > 20)
        {
            timeInWords.append(number_literals[19]);
            int temp1 = temp-20;
            timeInWords.append(" ");
            timeInWords.append(number_literals[temp1-1]);
            timeInWords.append(" ");
            timeInWords.append("minutes");
            timeInWords.append(" ");
            timeInWords.append(conjunction[conj]);
            timeInWords.append(" ");
            timeInWords.append(number_literals[h]);

        }
        return timeInWords;
    }
}
