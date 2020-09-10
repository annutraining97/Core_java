import java.util.Comparator;

public class Employee {
    int Salary;
    int age;
    int id;
    String name;

    public Employee(int salary, int age, int id, String name) {
        Salary = salary;
        this.age = age;
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "Salary=" + Salary +
                ", age=" + age +
                ", id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}

class SortByName implements Comparator<Employee>
{
    @Override
    public int compare(Employee o1, Employee o2) {
        return o1.name.compareTo(o2.name);
    }
}

class SortBySalary implements  Comparator<Employee>
{
    @Override
    public int compare(Employee o1, Employee o2) {
        return o1.Salary - o2.Salary;
    }
}

class SortByAge implements Comparator<Employee>
{
    @Override
    public int compare(Employee o1, Employee o2) {
        return o1.age - o2.age;
    }
}


class DuplicateRecordException extends Exception {
//    String message = "Duplicate record Found";
    public DuplicateRecordException(String message) {
        super(message);
    }
}