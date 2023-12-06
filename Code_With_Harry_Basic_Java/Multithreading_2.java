package Code_With_Harry_Basic_Java;

import java.util.Random;
import java.util.Scanner;

class MyThreadRunnable1 implements Runnable{
    @Override
    public void run() {
        for (int i=0;i<400;i++){
            System.out.println("I am Thread 1 ..........................");
        }
    }
}

class MyThreadRunnable2 implements Runnable{
    @Override
    public void run() {
        for (int i=0;i<400;i++){
            System.out.println("I am Thread 2 ..........................");
        }
    }
}

public class Multithreading_2 {

//    public  void try_23 (int a){
//        System.out.println("Hello if you can see this , then it is working ");
//    }

    public static void main(String[] args) {

        //Just like for a proper functioning of a gun you should put a bullet inside a gun then use the gun.
        MyThreadRunnable1 bullet1 = new MyThreadRunnable1();
        Thread gun1 = new Thread(bullet1);

        MyThreadRunnable2 bullet2 = new MyThreadRunnable2();
        Thread gun2 = new Thread(bullet2);

        //gun1.start();
        //gun2.start();

        Random rnd = new Random();
        int r = rnd.nextInt(0,200);
        System.out.println("Your Random Number is "+r);

//        Multithreading_2 no = new Multithreading_2();
//        no.try_23(34);
    }
}
