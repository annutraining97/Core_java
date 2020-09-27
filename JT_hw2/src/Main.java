import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {


        List<Employee> employeeList1 = new ArrayList<>();
        List<Employee> employeeList2 = new ArrayList<>();


        employeeList1.add(new Employee(1,"John", "Dev", 65000));
        employeeList1.add(new Employee(2,"Alison", "Dev", 75000));
        employeeList1.add(new Employee(4,"John4", "Dev", 85000));
        employeeList2.add(new Employee(3,"John3", "Dev", 95000));
        employeeList2.add(new Employee(2,"John2", "Dev", 55000));
        employeeList2.add(new Employee(2,"John", "Dev", 65000));


        Set<Employee> employeeList3 = new HashSet<>();
        employeeList3.addAll(employeeList1);
        employeeList3.addAll(employeeList2);




//        employeeList3.addAll(employeeList_temp);

        for(Employee k:employeeList3)
        {
            System.out.println(k.getId());
        }


    }

}
