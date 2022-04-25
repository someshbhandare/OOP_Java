package Polymorphism;

public class ExceptionDemo {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        int result = 0;

        try{
            result = a/b;
        }
        catch (Exception e){
            System.out.println("Divide by zero exception");
        }
        System.out.println(result);
    }
}
