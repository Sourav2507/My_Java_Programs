package Code_With_Harry_Exercises;

import java.util.Scanner;

public class Exercise_1_Percentage_Calculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("\nEnter the number of Subjects you have");
        short no_sub = sc.nextShort();

        System.out.println("Enter the maximum Marks in each Subject");
        short max_marks = sc.nextShort();

        int total_marks = 0;

        for (int i = 1; i<=no_sub ;i++) {

            System.out.println("Enter the marks obtained in Subject "+i);
            short sub_marks = sc.nextShort();

            total_marks+=sub_marks;
        }
        double percentage = (total_marks*100)/(max_marks * no_sub) ;
        System.out.println("Thus your Percentage is "+percentage+" %");

        if (percentage<30.0){
            System.out.println("Sorry but You Failed !!");
        }
        else {
            System.out.println("Congratulations You Passed !!");
            System.out.println("Thank You !!");
        }
    }
}
