package Code_With_Harry_Basic_Java;

import java.util.Scanner;

public class Trt_catch_Block {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number : ");
        int a = sc.nextInt();

        System.out.println("Enter second number : ");
        int b = sc.nextInt();

        try{
           int c = a/b;
            System.out.println("Thus "+a+" divided by "+b+" equals "+c);
        }
        catch (Exception e){
            System.out.println("Sorry could not divide "+a+" by "+b);
            System.out.println("Reason : \t"+e);//prints the cause of the exception
        }
        System.out.println("\nEnd of the program");
    }
}
