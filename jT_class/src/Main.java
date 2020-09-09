import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<EMployee> employee_list = new ArrayList<>();
//        creating multiple instances for employee objects.
        EMployee emp1 = new EMployee(12,"A", 200);
        EMployee emp2 = new EMployee(7,"B",300);
        EMployee emp3 = new EMployee(16,"C",400);

//        Just to make everything is working fine, printing the list out
        employee_list.add(emp1);
        employee_list.add(emp2);
        employee_list.add(emp3);
//        System.out.println(employee_list);

        for(EMployee emp: employee_list)
        {
            System.out.println(emp.id+"->"+emp.Salary+"->"+emp.name);
        }
        Collections.sort(employee_list);
//        Sorting using their ids using comparator method
        Collections.sort(employee_list);
        System.out.println("After Sorting");
        for(EMployee emp: employee_list)
        {
            System.out.println(emp.id+"->"+emp.Salary+"->"+emp.name);
        }
    }
}
