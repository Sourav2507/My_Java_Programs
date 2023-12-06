package Code_With_Harry_Basic_Java;

import java.util.Scanner;

class fibonacci_series{

    int series (int n){
        if (n==1){
            return 0;
        }
        else if (n==2) {
            return 1;
        }
        else {
            return series(n-1) +series(n-2);
        }
    }

}
public class Recursions {


    void new_method(int n){
        System.out.println("Hello how are you "+n);
    }
    //Finding Factorial
     static long factorial(int n){
        if (n==1 || n==0){
            return 1;
        }
        else {
            long ans = n*factorial(n-1);
            return ans;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Creating an object to call a non-static method
        Recursions object = new Recursions();
        object.new_method(1);

        //Finding Factorial :
        System.out.print("Enter a number to find  it's factorial : ");
        short num = sc.nextShort();

        System.out.println("Thus the factorial of "+num+" is : "+factorial(num));

        //Fibonacci Series :

        fibonacci_series fib = new fibonacci_series();

        System.out.println("Thus "+num+"th term of the fibonacci series is "+fib.series(num));
    }
}
