package practical1;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two no:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int result = -1;

        try{
            result = a/b;
        }
        catch (Exception e){
            System.out.println("Exception occured: "+e.getMessage());
            System.exit(1);
        }
        System.out.println("result = "+result);
    }
}
