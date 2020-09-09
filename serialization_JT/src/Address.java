import java.io.Serializable;

public class Address implements Serializable {
    String Street_name;
    int Apt_no;
    String Apt_name;

    public Address(String street_name, int apt_no, String apt_name) {
        Street_name = street_name;
        Apt_no = apt_no;
        Apt_name = apt_name;
    }
}
