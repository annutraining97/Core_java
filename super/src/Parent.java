public class Parent {
    int a = 10;
    int b = 20;
//    creating a constructor


    public Parent() {
    }

    public Parent(int a, int b) {
        this.a = a;
        this.b = b;
    }

    //    creating a parent method
    public int sum (int a, int b)
    {
        return a*b;
    }
}
