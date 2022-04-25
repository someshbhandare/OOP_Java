package practical5;

import java.util.Arrays;
import java.util.Scanner;

public class SortIntegerArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        String[] names = new String[5];

        System.out.println("Enter integers: ");
        for(int i=0; i<5; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter names: ");
        for(int i=0; i<5; i++){
            names[i] = sc.next().trim();
        }

        Arrays.sort(arr);
        Arrays.sort(names);

        System.out.println("Sorted integers:");
        System.out.println(Arrays.toString(arr));
        System.out.println("Sorted names:");
        System.out.println(Arrays.toString(names));
    }
}
