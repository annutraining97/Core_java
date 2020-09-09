import java.io.*;

public class Main {
    public static void main(String[] args) {
        Address new_address = new Address("823 Ralston street", 101, "Berger Apts");

        try
        {
            FileOutputStream write_file = new FileOutputStream("write_file.ser");
            ObjectOutputStream out = new ObjectOutputStream(write_file);
            out.writeObject(new_address);
            out.close();
            write_file.close();

        }
        catch (IOException e)
        {
            e.printStackTrace();
        }

        try
        {
            FileInputStream read_file = new FileInputStream("write_file.ser");
            ObjectInputStream in = new ObjectInputStream(read_file);
            Address address = (Address) in.readObject();
            System.out.println(address.Street_name+", "+address.Apt_no+", "+address.Apt_name);

        }catch(IOException e)
        {
            e.printStackTrace();
        }
        catch (ClassNotFoundException e)
        {
            e.printStackTrace();
        }

//        System.out.println();
    }
}
