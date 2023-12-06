package Code_With_Harry_Practice_Problems;

import java.util.Scanner;

public class Chapter_4_Practice_Set_Problem_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your Annual Income in Lakhs : ");
        float income = sc.nextFloat();

        float tax = 0f;

        if (income<=2.5){
            System.out.println("Total tax amount to pe paid : "+tax+" Lakhs INR");
        }
        if (income>2.5&&income<=5){
            tax= ((income-2.5f)*5f)/100;
            System.out.println("Total tax amount to pe paid : "+tax+" Lakhs INR");
        }
        if (income>5&&income<=10){
            tax= ((income-5f)*20f)/100 + ((5f-2.5f)*5f)/100;
            System.out.println("Total tax amount to pe paid : "+tax+" Lakhs INR");
        }
        if (income>10){
            tax= ((income-10f)*30f)/100 +((10f-5f)*20f)/100 + ((5f-2.5f)*5f)/100;
            System.out.println("Total tax amount to pe paid : "+tax+" Lakhs INR");
        }

        System.out.println("Enter Day Number");
        int day = sc.nextInt();
        switch (day){
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            case 7 -> System.out.println("Sunday");
        }

        if (day>7){
            System.out.println("Incorrect day number !!");
        }
    }
}
