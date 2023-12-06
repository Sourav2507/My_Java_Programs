package Code_With_Harry_Basic_Java;

import java.util.Scanner;

public class Methods_Overloading_and_Var_Args {

    static  int sum(int n , int m){
        return m+n;
    }
    static int sum(int ... arr){
        //Takes an Array named arr as an input to run this method.
        int result = 0;
        for (int element:arr){
            result+=element;
        }
        return result;
    }

    public static void main(String[] args) {

        System.out.println("The sum of 1 and 2 is : "+sum(1,2));

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter how many numbers you want to add : ");
        short count = sc.nextShort();

        int [] arr = new int[count];

        for (short i = 0;i<count;i++){

            System.out.print("Enter number : ");
            int num = sc.nextInt();

            arr [i] = num;
        }
        System.out.println("Thus the sum of the numbers is : "+sum(arr));
    }
}
