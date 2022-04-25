package practical4;

import java.util.Scanner;

// Assignment 4
class Rectangle {
    double length, width, area; // instance variable
    String color;

    void get_length(double l){
        length = l;
    }

    void get_width(double w){
        width = w;
    }

    void get_colour(String c){
        color = c;
    }

    void find_area(){
        area = length * width;
        System.out.println("Area of rectangle: "+area);
    }
}

public class RectangleDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter length, width and color for rectangle1:");
        double length1 = sc.nextInt();
        double width1 = sc.nextInt();
        String color1 = sc.next();

        Rectangle r1 = new Rectangle();
        r1.get_length(length1);
        r1.get_width(width1);
        r1.get_colour(color1);

        System.out.println("Enter length, width and color for rectangle2:");
        double length2 = sc.nextInt();
        double width2 = sc.nextInt();
        String color2 = sc.next();

        Rectangle r2 = new Rectangle();
        r2.get_length(length2);
        r2.get_width(width2);
        r2.get_colour(color2);

        r1.find_area();
        r2.find_area();

        if(r1.area==r2.area && r1.color.equals(r2.color)){
            System.out.println("Matching Rectangles");
        }
        else{
            System.out.println("Not Matching Rectangles");
        }

    }
}
