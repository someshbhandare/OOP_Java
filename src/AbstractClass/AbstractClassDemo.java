package AbstractClass;

abstract class Shape{
    public abstract void printArea(int n);
}

class Square{
    public void printArea(int n){
        System.out.println("Area of Square is: "+ (n*n));
    }
}

public class AbstractClassDemo {
    public static void main(String[] args) {
        Square sq = new Square();
        sq.printArea(5);
    }
}
