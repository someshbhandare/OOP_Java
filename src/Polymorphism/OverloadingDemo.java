package Polymorphism;

public class OverloadingDemo {
    public static int add(int a, int b){
        return a+b;
    }
    public static String add(String a, String b){
        return a+b;
    }
    public static void main(String[] args) {
        System.out.println(add("Somesh", " Bhandare"));
        System.out.println(add(40,50));
    }
}
