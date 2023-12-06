package Code_With_Harry_Practice_Problems;

import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;

class Employee{
    Random rnd = new Random();
    int id = rnd.nextInt(1000,9999);
    String name;
    int salary;

    public int getSalary(){
        return salary;
    }

    public String getName(){
        return name;
    }

    public void setName(String new_name){
        name = new_name;
    }

}

class cellphone{

    public void call (){
        System.out.println("Ring..Ring..Ring..Ring....'Incoming Call'......Ring..Ring..Ring..Ring....'Incoming Call'......Ring..Ring..Ring..Ring");
    }

    public void vibrate (){
        System.out.println("Buzzz..zzzzz..Buzzz..zzzzz...zzzzz...zzzzz..Buzzz..zzzzz");
    }
}

class square{

    int length;

    public int peri (){
        return 4*length;
    }

    public int ar(){
        return length*length;
    }

}

class rectangle{

    int length;
    int breadth;

    public int peri (){
        return 2*(length+breadth);
    }

    public int ar(){
        return length*breadth;
    }

}

class TommyVecetty {

    public void hit(){
        System.out.println("Hitting.......");
    }
    public void run(){
        System.out.println("Running.......");
    }
    public void fire(){
        System.out.println("Firing.......");
    }

}

class circle {
    int radius;

    public float peri(){
        return (float) (radius*2*Math.PI);
    }

    public float ar(){
        return (float) (radius*radius*Math.PI);
    }
}

public class Chapter_8_Practice_Set {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //Problem 1

        /*Employee emp1 = new Employee();

        System.out.print("Enter name : ");
        emp1.name=sc.nextLine();

        System.out.print("Enter Salary : ");
        emp1.salary= sc.nextInt();

        System.out.println("\nEmployee Details :- \n\n Employee Id :- "+emp1.id+"\n Employee Name :- "+emp1.getName()+"\n Employee Salary :- "+emp1.getSalary()+" INR");

        System.out.println("Enter Name of the Employee : ");
        String n = sc.nextLine();

        emp1.setName("Aman Gupta");
        System.out.println("\nEmployee Details :- \n\n Employee Id :- "+emp1.id+"\n Employee Name :- "+emp1.getName()+"\n Employee Salary :- "+emp1.getSalary()+" INR");

        System.out.println("Problem 1 Enda here !!");
         */

        //Problem 2

        /*cellphone phone = new cellphone();

        phone.vibrate();
        System.out.println();
        phone.call();

        System.out.println("Problem 2 ends here !!");*/

        //Problem 3

        /*square A = new square();

        System.out.print("Enter the Side length of the Square : ");
        int l = sc.nextInt();

        A.length = l;

        System.out.println("\n\n Thus the Perimeter of the square with length "+A.length+" is "+A.peri()+" and the Area is : "+A.ar());

        System.out.println("Problem 3 Ends here !!");*/

        //Problem 4

        /*System.out.print("Enter the Length of the Rectangle : ");
        int l = sc.nextInt();

        System.out.print("Enter the Breadth of the Rectangle : ");
        int b = sc.nextInt();

        rectangle R = new rectangle();

        R.length=l;
        R.breadth=b;

        System.out.println("\n\n Thus the Perimeter of the Rectangle with length "+R.length+" and breadth "+R.breadth+" is : "+R.peri()+" \t\tand the Area is : "+R.ar());

        System.out.println("Problem 4 ends here !!");*/

        //Problem 5

        /*TommyVecetty player = new TommyVecetty();

        player.run();
        System.out.println();

        player.hit();
        System.out.println();

        player.fire();
        System.out.println();

        System.out.println("Problem 5 ends here !!");*/

        //Problem 6

        /*System.out.print("Enter the Radius of the Circle : ");
        int r = sc.nextInt();

        circle C = new circle();
        C.radius=r;

        System.out.println("Thus the Perimeter of the Circle with Radius "+C.radius+" is : "+C.peri()+"\t\t and the Area is : "+C.ar());

        System.out.println("\nProblem 6 Ends here !!");*/
    }
}
