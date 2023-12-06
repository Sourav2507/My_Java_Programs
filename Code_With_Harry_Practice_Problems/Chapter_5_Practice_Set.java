package Code_With_Harry_Practice_Problems;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Chapter_5_Practice_Set {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //Problem 1 (Printing  the triangular Pattern)
        /*System.out.print("Enter the width of the triangle : ");
        short width = sc.nextShort();

        for (short i = width;i>=1;i--){
            for (short j = i ;j>=1;j--){
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("Problem 1 Ends Here !!\n");*/

        //Problem 2 (Sum of n even numbers)

        /*System.out.print("Enter the number of even numbers you want to add including 0 : ");
        short n = sc.nextShort();

        int sum = 0;

        for (short i =1 ;i<n;i++){
            sum+=(2*i);
        }
        System.out.println("Thus ther sum of first "+n+" even numbers is "+sum);

        System.out.println("Problem 2 Ends Here !!\n");*/

        //Problem 3(Multiplication Table)

        /*System.out.print("Enter the number : ");
        short num = sc.nextShort();

        System.out.println("Thus the multiplication Table of "+num+" is :- ");
        for (short i = 1 ;i<=10;i++){
            System.out.println(num+" x "+i+" = "+(num*i));
        }
        System.out.println("Problem 3 Ends Here !!\n");*/

        //Problem 4(Reverse Multiplication Table)

        /*System.out.print("Enter the number : ");
        short numr = sc.nextShort();

        System.out.println("Thus the multiplication Table of "+numr+" is :- ");
        for (short i = 10 ;i>=1;i--){
            System.out.println(numr+" x "+i+" = "+(numr*i));
        }
        System.out.println("Problem 4 Ends Here !!\n");*/

        //Problem 5(Factorial of a Given Number)

        /*System.out.print("Enter the number : ");
        short fact = sc.nextShort();

        int ans = 1;

        for (short i = 1;i<=fact;i++){
            ans*=i;
        }
        System.out.println("Thus the Factorial of "+fact+" is "+ans);

        System.out.println("Problem 5 Ends Here !!\n");*/

        //Problem 6(Problem 5 using a while Loop)

        /*System.out.print("Enter The Number : ");
        short num = sc.nextShort();

        short orinum=num;

        int factorial = 1;

        while(num>=1){
            factorial*=num;
            num--;
        }
        System.out.println("Thus the Factorial of "+orinum+" is "+factorial);

        System.out.println("Problem 6 Ends Here !!\n");*/

        //Problem 7(1 using While Loop)

        /*System.out.print("Enter the Width of the Triangle : ");
        short width = sc.nextShort();

        short i = width;
        short j ;
        while (i>=1){
            j = i;
            i--;
            while(j>=1){
                System.out.print("*");
                j--;
            }
            System.out.println();
        }
        System.out.println("Problem 7 Ends Here !!\n");*/

        //Problem 8  Ans :- True

        //Problem 9(Sum of numbers Occuring in the Multiplication Table of n)

        /*System.out.print("Enter the Number : ");
        short num = sc.nextShort();

        int ans = 0;

        for (short i = 1;i<=10;i++){
            ans+=(num*i);
        }
        System.out.println("Thus the sum of all the terms of the multiplication table of "+num+" is "+ans);

        System.out.println("Problem 9 Ends Here !!\n");*/

        //Problem 10 Ans :- Atleast Once !

        //Problem 11(2 using While Loop)

        /*System.out.print("Enter the number of even numbers you want to add including 0 : ");
        short n = sc.nextShort();

        int ans = 0;
        byte i = 1;
        while (i<n){
            ans+=(2*i);
            i++;
        }
        System.out.println("Thus the sum of first "+n+" even numbers is "+ans);

        System.out.println("Problem 2 Ends Here !!\n");*/
    }
}
