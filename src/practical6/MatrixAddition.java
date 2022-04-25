package practical6;

import java.util.Arrays;
import java.util.Scanner;

public class MatrixAddition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter rows and columns for matrix:");
        int row = sc.nextInt();
        int col = sc.nextInt();

        int[][] arr1 = new int[row][col];
        int[][] arr2 = new int[row][col];
        int[][] result = new int[row][col];

        System.out.println("Enter values for matrix1:");
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                arr1[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter values for matrix2:");
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                arr2[i][j] = sc.nextInt();
            }
        }

        // matrix addition
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                result[i][j] = arr1[i][j] + arr2[i][j];
            }
        }

        System.out.println("Matrix addition:");
        for(int i=0; i<row; i++){
            System.out.println(Arrays.toString(result[i]));
        }
    }
}
