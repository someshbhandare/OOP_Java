package Polymorphism;

import java.util.Scanner;

class Animal{
    public void sleep(){
        System.out.println("Zzzzzzzz");
    }
    public void noise(){
        System.out.println("Grrrr");
    }
    public void roam(){
        System.out.println("Roaming near water");
    }
}

class Lion extends Animal {
    public void noise(){
        System.out.println("Roar: Rrrrr");
    }
}

class Cat extends Animal {
    public void noise(){
        System.out.println("Meouw Meouw");
    }
}

class Wolf extends Animal {
    public void noise(){
        System.out.println("Houling: Ouoooo!");
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(true) {
            System.out.println("1 - Wolf");
            System.out.println("2 - Lion");
            System.out.println("3 - Cat");
            System.out.println("Any other key to exit");
            System.out.println("Enter your choice: ");
            int n = sc.nextInt();

            switch (n) {
                case 1:
                    Wolf w = new Wolf();
                    w.sleep();
                    w.noise();
                    w.roam();
                    break;
                case 2:
                    Lion l = new Lion();
                    l.sleep();
                    l.noise();
                    l.roam();
                    break;
                case 3:
                    Cat c = new Cat();
                    c.sleep();
                    c.noise();
                    c.roam();
                    break;
                default:
                    System.exit(0);
            }
        }
    }
}
