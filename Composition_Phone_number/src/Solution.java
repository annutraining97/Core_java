public class Solution {
    String name;
    Details Person1;

    public Solution(String name, Details person1) {
        this.name = name;
        Person1 = person1;
    }

    public void display()
    {
        System.out.println(name+"-----------"+Person1.address+"--------"+Person1.phone_number);
    }

}
