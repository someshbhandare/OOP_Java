package practical3;

public class UnaryOperatorExp1 {
    public static void main(String[] args) {
        int a = 20;
        int b = 30;
        System.out.println(a++);
        System.out.println(++a);
        System.out.println(++a + a++);
        System.out.println(b++ + b++);
    }
}
