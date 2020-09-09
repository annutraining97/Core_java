

public class EMployee implements Comparable<EMployee>{
    int id;
    String name;
    int Salary;

    public EMployee (int id, String name, int salary) {
        this.id = id;
        this.name = name;
        Salary = salary;
    }


    @Override
    public int compareTo(EMployee o1) {


        return this.id - o1.id;
    }
}
