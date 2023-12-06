package Code_With_Harry_Practice_Problems;

import java.util.Scanner;

public class Chapter_7_Practice_Set {

    //Problem 1
    static void multiply (int n){
        System.out.println("\nThus the Multiplication table of "+n+" is : ");
        for (short i = 1; i<=10;i++){
            System.out.println(n+" X "+i+" = "+(n*i));
        }
    }

    //Problem 2
    static void pattern (short n){
        for (short i = 1 ; i<=n;i++){
            for (short j = 1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    //Problem 3
    static void addN(int n){
        int ans = 0;
        for (short i = 1; i<=n;i++){
           ans+=i;
        }
        System.out.println("Thus the sum of "+n+" natural numbers is : "+ans);
    }

    //Problem 4
    static void inverted_pattern(short n){
        for (short i = n ; i>=1;i--){
            for (short j = 1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    //Problem 5
    static int fib (int n){
        if (n==3||n==2){
            return 1;
        }
        else if (n==1) {
            return 0;
        }
        else {
            return fib(n-1)+fib(n-2);
        }
    }

    //Problem 6(Average Using Varargs)
    static int avg (int ... arr){
        int sum = 0;
        for (int element :arr){
            sum+=element;
        }
        return  sum/ arr.length;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Problem 1 (Multiplication Table using Method)
        /*System.out.print("Enter any Number : ");
        short num = sc.nextShort();

        multiply(num);
        System.out.println("Problem 1 ends Here !!");*/

        //Problem 2(Triangular Pattern)

        //Problem 3(Sum of n natural numbers)
        /*System.out.print("Enter how many natural numbers you want to add : ");
        short q = sc.nextShort();

        addN(q);
        System.out.println("Problem 3 ends Here !!");
        */

        //Problem 4(Inverted pattern)
        /*System.out.print("Enter the height of the triangle : ");
        short w = sc.nextShort();

        inverted_pattern(w);
        System.out.println("Problem 4 ends Here !!");*/

        //Problem 5(nth term of Fibonacci series)
        /*System.out.print("Enter the term you want to find : ");
        short n = sc.nextShort();

        System.out.println("Thus the "+n+"th term of the Fibonacci Series is : "+fib(n));
        System.out.println("Problem 4 ends Here !!");*/

        //Problem 6(Average of numbers using Varargs)
        /*System.out.print("Enter how many numbers you want to add : ");
        short count = sc.nextShort();

        int [] Arr = new int[count];
        for (int i =0;i<count;i++){

            System.out.print("Enter Number : ");
            int n = sc.nextInt();
            Arr[i]=n;
        }
        System.out.println("Thus the average of numbers is : "+avg(Arr));
        System.out.println("Problem 6 Ends here !!");*/
    }
}
