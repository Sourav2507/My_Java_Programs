package Code_With_Harry_Practice_Problems;

import java.util.Scanner;

public class Chapter_4_Practice_Set_Problem_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of Subjects you have");
        short no_sub = sc.nextShort();

        System.out.println("Enter the maximum Marks in each Subject");
        short max_marks = sc.nextShort();

        int total_marks = 0;

        float sub_per;
        boolean fail=false;

        for (int i = 1; i<=no_sub ;i++) {

            System.out.println("Enter the marks obtained in Subject "+i);
            short sub_marks = sc.nextShort();

            total_marks=total_marks+sub_marks;

            sub_per=(sub_marks*100)/max_marks;

            if (sub_per<33){
                System.out.println("Sorry but you failed in this Subject");
                fail=true;
            }
        }
        double percentage = (total_marks*100)/(max_marks * no_sub) ;
        System.out.println("Thus your Percentage is "+percentage+" %");

        if (percentage<40.0||fail==true){
            System.out.println("Sorry but You Failed the Exam !!");
        }
        else {
            System.out.println("Congratulations You Passed the Exam !!");
        }
    }
}
