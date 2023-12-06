package Code_With_Harry_Basic_Java;

class MyThread1 extends Thread{

    public void run(){
        while (true) {
            System.out.println("Exams");
        }
    }
}

class MyThread2 extends Thread{

    public void run() {
        while (true) {
            System.out.println("Assignments");
        }
    }
}

public class Multithreading {
    public static void main(String[] args) {

        MyThread1 t1 = new MyThread1();
        Thread T1 = new Thread(t1);
        MyThread2 t2 = new MyThread2();
        Thread T2 = new Thread(t2);
 T1.start();
        T2.start();
    }
}