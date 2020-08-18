public class Main {
    public static void main(String[] args) {
        String sub = "Let's have some fun in ";
        immutable immut = new immutable("coding");
        String action = immut.getAction();
//        System.out.println(action);
        Solution sol = new Solution();
        sol.strings1(sub,action);
    }
}
