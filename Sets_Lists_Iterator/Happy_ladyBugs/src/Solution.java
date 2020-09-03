import java.util.*;

public class Solution {
    static String happyLadybugs(String b) {
        if(b.length()==1)
        {
            if(b.equals("_"))
            {
                return "YES";
            }
            else
            {
                return "NO";
            }
        }
        else
        {
            Set<Character> colors = new HashSet<>();
            List<Integer> count_chars = new ArrayList<>();
//            int count_underscore =0;
            for(int i =0; i<b.length();i++)
            {
                if(b.charAt(i)!='_') {
                    colors.add(b.charAt(i));
                }
            }
            for(Character s:colors)
            {
                int count = 0;
                for(int i =0; i<b.length();i++)
                {
                    if( s.equals(b.charAt(i)))
                    {
                        count++;
                    }
                }
                count_chars.add(count);
            }
//            System.out.println(count_chars);
            if(count_chars.size()!=0) {
                if (Collections.min(count_chars) == 1) {
                    return "NO";
                }
                else if(Collections.max(count_chars)==b.length()){
                    return "YES";
                }
                    else {
                    if (b.contains("_")) {
                        return "YES";
                    } else {
                        int temp = 0;
                        for(int i =1; i<b.length()-1;i++)
                        {
                            if(b.charAt(i-1)==b.charAt(i) || b.charAt(i+1)==b.charAt(i) )
                            {
                                temp++;
                            }

                        }
//                        System.out.println("temp= "+temp);
                        if(temp+2==b.length())
                        {
                            return "YES";
                        }
                        else
                        {
                            return "NO";
                        }
//                        return null;

                    }
                }
            }
            else
            {
                return "YES";
            }

        }


    }
}
