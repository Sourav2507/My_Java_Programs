package Code_With_Harry_Exercises;

import java.util.Scanner;

public class
Exercise_6_Matrix_Transpose {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of columns in the Matrix : ");
        int x = sc.nextInt();

        System.out.print("Enter number of rows in the Matrix : ");
        int y = sc.nextInt();

        int Matrix[][] = new int[x][y];

        System.out.println();

        for (int i = 0; i<y ; i++){
            for (int j = 0 ; j<x ; j++){
                System.out.print("Enter element of ("+(i+1)+","+(j+1)+") :");
                Matrix[j][i]=sc.nextInt();
            }
        }
        System.out.println("\nEntered Matrix is : ");
        for (int i = 0; i<y ; i++){
            System.out.print("\t\t(");
            for (int j = 0 ; j<x ; j++){
                System.out.print(Matrix[j][i]+" ");
            }
            System.out.print(")");
            System.out.println();
        }
        System.out.println("\nTranspose of the Entered Matrix is : ");
        for (int i = 0; i<x ; i++){
            System.out.print("\t\t(");
            for (int j = 0 ; j<y ; j++){
                System.out.print(Matrix[i][j]+" ");
            }
            System.out.print(")");
            System.out.println();
        }
    }
}
