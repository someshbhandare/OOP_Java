package Interface.Demo;

interface Fruit{
    public void color();
}

class Apple implements Fruit{
    public void color(){
        System.out.println("Color of apple is: red");
    }
}

class Banana implements Fruit{
    public void color(){
        System.out.println("Color of Banana is: Yellow");
    }
}

public class InterfaceDemo {
    public static void main(String[] args) {
        Fruit apple = new Apple();
        Fruit banana = new Banana();

        apple.color();
        banana.color();
    }
}
