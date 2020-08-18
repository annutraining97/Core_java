public class Main {
    public static void main(String[] args) {
//        single level inheritance
        System.out.println("Performing Single inheritance");
        Single single = new Single();
        single.print_A();
        single.print_Single();
//        multi-level inheritance
        System.out.println("performing multi level inheritance");
        Multilevel multilevel =  new Multilevel();
        multilevel.print_A();
        multilevel.print_Single();
        multilevel.print_Multilevel();
//        Hierarchical inheritance
        System.out.println("Performing Hierarchical inheritance");
        Hierarchical hierarchical = new Hierarchical();
        hierarchical.print_hierarchical();
        hierarchical.print_A();
    }
}
