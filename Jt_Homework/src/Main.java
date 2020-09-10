import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main extends Exception{
    public static void main (String[] args) {
        List<Employee> employee_list = new ArrayList<>();
        employee_list.add(new Employee(1000, 23, 45, "Anuraag Kotra"));
        employee_list.add(new Employee(5000, 29, 12, "Sunil thomas George"));
        employee_list.add(new Employee(6000, 32, 05, "Sravan kanukolanu"));
        employee_list.add(new Employee(800, 23, 54, "Manish Gubba"));
        employee_list.add(new Employee(4000, 24, 9, "Vineeth Rajamohan"));
        employee_list.add(new Employee(7000, 28, 10, "Vikesh Nallimilli"));
        employee_list.add(new Employee(5000, 26, 30, "Anudeep gajjala"));
        employee_list.add(new Employee(3000, 30, 35, "Sandeep Reddy"));
        employee_list.add(new Employee(1900, 25, 25, "Revanth konda"));
        employee_list.add(new Employee(4000, 23, 45, "Anuraag Kotra"));


        System.out.println("Before Sorting:");
        for(int i =0; i<employee_list.size(); i++)
        {
            System.out.println(employee_list.get(i));
        }

        System.out.println("Sorting By Name");
        Collections.sort(employee_list, new  SortByName());

        for(int i =0; i<employee_list.size(); i++)
        {
            System.out.println(employee_list.get(i));
        }

        System.out.println("Sorting by Salary: Ascending Order");
        Collections.sort(employee_list, new SortBySalary());
        for(int i =0; i<employee_list.size(); i++)
        {
            System.out.println(employee_list.get(i));
        }

        System.out.println("Sorting by Salary: descending Order");
        Collections.reverse(employee_list);
        for(int i =0; i<employee_list.size(); i++)
        {
            System.out.println(employee_list.get(i));
        }

        System.out.println("Sorting by Age");
        Collections.sort(employee_list, new SortByAge());
        for(int i =0; i<employee_list.size(); i++)
        {
            System.out.println(employee_list.get(i));
        }
        System.out.println("\n Checking if any duplicate records are there in the list of employees \n");
        try
        {
            testing(employee_list);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }







    }

    static void testing(List<Employee> employee_list) throws DuplicateRecordException{
        for(int i =0; i<employee_list.size(); i++)
        {
            for(int j =0; j<employee_list.size(); j++)
            {
                if(i!=j && employee_list.get(i).getName()==employee_list.get(j).getName() && employee_list.get(i).getId()==employee_list.get(i).getId())
                {
                    throw new DuplicateRecordException("Duplicate record Found");
                }
            }
        }

    }
}
