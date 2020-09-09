import java.util.Comparator;

public class Address {
    int Apt_no;
    String Apt_name, Street_name;

    public Address(int apt_no, String apt_name, String street_name) {
        Apt_no = apt_no;
        Apt_name = apt_name;
        Street_name = street_name;
    }

    @Override
    public String toString() {
        return "Address{" +
                "Apt_no=" + Apt_no +
                ", Apt_name='" + Apt_name + '\'' +
                ", Street_name='" + Street_name + '\'' +
                '}';
    }
}

class SortByAptNo implements Comparator<Address>
{
    @Override
    public int compare(Address o1, Address o2) {
        return o1.Apt_no - o2.Apt_no;
    }
}

class SortByApt_name implements Comparator<Address>
{
    @Override
    public int compare(Address o1, Address o2) {
        return o1.Apt_name.compareTo(o2.Apt_name);
    }
}

class SortByStreet_name implements Comparator<Address>
{
    @Override
    public int compare(Address o1, Address o2) {
        return o1.Street_name.compareTo(o2.Street_name);
    }
}



