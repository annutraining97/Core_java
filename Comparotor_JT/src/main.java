import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class main {
    public static void main(String[] args) {
        List<Address> address_list = new ArrayList<>();
        address_list.add(new Address(101, "Berger", "Ralston street"));
        address_list.add(new Address(11, "University terrace", "North center Street"));
        address_list.add(new Address(17, "Nevada hills", "Nevada street"));

        Collections.sort(address_list, new SortByAptNo());
        System.out.println("Sorted by Apt no: ");
        for(int i =0; i<address_list.size();i++)
        {
            System.out.println(address_list.get(i));
        }

        Collections.sort(address_list, new SortByApt_name());
        System.out.println("Sorted by Apt name: ");
        for(int i =0; i<address_list.size();i++)
        {
            System.out.println(address_list.get(i));
        }
        System.out.println("Sorted by Street name: ");
        Collections.sort(address_list, new SortByStreet_name());

        for(int i =0; i<address_list.size();i++)
        {
            System.out.println(address_list.get(i));
        }


    }
}
