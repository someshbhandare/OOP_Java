package practical1;

import java.util.Scanner;

public class SumAndAverage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number:");
        int n = sc.nextInt();

        int sum = 0;
        double avg = 0;

        for(int i=1; i<=n; i++){
            sum += i;
        }

        avg = (double)sum/n;
        System.out.println("sum= "+sum);
        System.out.println("Avg= "+avg);
    }
}
