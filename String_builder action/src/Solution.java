public class Solution {
    public void strings1(String sub, String action)
    {

        sub.concat(action);
        System.out.println("To check strings are immutable or not --------> "+sub);
        int length_action = action.length();
        int sub1 = sub.length()-1-length_action;
        String sub2 = sub.substring(sub1,sub.length());
        System.out.println("Using Substring ------------> "+sub2);
//        Comparing two strings using equals
        if(sub.length() > length_action && sub.substring(sub1,sub.length()).equals(action))
        {
            System.out.println(sub);
        }
        else if(!sub.substring(sub1,sub.length()).equals(action))
        {
//            Using string builder to concatenate a string to another string
            StringBuilder sb = new StringBuilder(sub);
            sb.append(action);
            System.out.println(sb);

        }

    }
}
