public class Solution {
    int a;
    int b;

//  Creating a default constructor

    public Solution() {
    }

//    creating constructor with parameters

    public Solution(int a, int b) {
        this.a = a;
        this.b = b;
    }

//    setters for a and b
    public int setA(int a) {
        this.a = a;
        return a;
    }

    public int setB(int b) {
        this.b = b;
        return b;
    }
}
