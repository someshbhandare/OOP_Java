package practical7;

import java.util.Scanner;

public class ComplexNo {
    private double real, img;

    ComplexNo(double real, double img){
        this.real = real;
        this.img = img;
    }

    public static ComplexNo addComplexNo(ComplexNo c1, ComplexNo c2){
        ComplexNo result = new ComplexNo(0,0);
        result.real = c1.real + c2.real;
        result.img = c1.img + c2.img;
        return result;
    }

    @Override
    public String toString() {
        return real+" + "+img+"i";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double r1, r2, i1, i2;
        System.out.println("Enter Real part of 1st No: ");
        r1 = sc.nextDouble();
        System.out.println("Enter Imaginary part of 1st No: ");
        i1 = sc.nextDouble();

        System.out.println("Enter Real part of 2nd No: ");
        r2 = sc.nextDouble();
        System.out.println("Enter Imaginary part of 2nd No: ");
        i2 = sc.nextDouble();

        ComplexNo c1 = new ComplexNo(r1, i1);
        ComplexNo c2 = new ComplexNo(r2, i2);
        System.out.println("sum is: "+addComplexNo(c1, c2));
    }
}
