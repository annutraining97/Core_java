import java.util.LinkedList;
import java.util.Vector;

public class Main  {
    public static void main(String[] args) {
//        creating a vector - vectors don't need initial capacity

        Vector vec = new Vector();
        vec.add(12);
        vec.add(24);
        vec.add(36);
        vec.add(48);
        vec.add(60);
//        printing element at index = 2;
        System.out.println(vec.get(2));
        LinkedList<Integer> L_list = new LinkedList<>();
//            Iterating vector and adding it in the LinkedList
        for(int i =0; i<vec.size();i++)
        {
            L_list.add((int)vec.get(i));
        }
//        printing out the whole linked List
        System.out.println(L_list);
//        using peek adding first and last element
        System.out.println(L_list.peek()+L_list.peekLast());
//        using pop deleting the first element and printing out the whole linkedList
        L_list.pop();
        System.out.println(L_list);
        L_list.push(72);
        System.out.println(L_list);


    }
}
