package practical1;

import java.util.Arrays;
import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        System.out.println("The first 50 prime no. are:");
        System.out.print("2 ");
        int count = 1;
        for(int i=3; count<50; i++){
            if(isPrime(i)){
                System.out.print(i+" ");
                count++;
            }
        }
        System.out.println();
    }

    public static boolean isPrime(int n){
        for(int i = 2; i<=n/2; i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
}
