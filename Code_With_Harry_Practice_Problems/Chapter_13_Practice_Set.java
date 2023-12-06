package Code_With_Harry_Practice_Problems;

class MyThread1 implements Runnable{
    public void run(){
        int i=1;
        while (i<1){
            System.out.println("Good Morning");
        }
    }
}

class MyThread2 implements Runnable{
    public void run(){
        int i = 0;
        while (i<100){
            try {
                Thread.sleep(200);
            }catch (Exception e){
                System.out.println(e);
            }
            System.out.println("Welcome !"+i);
            i++;
        }

    }
}

public class Chapter_13_Practice_Set {
    public static void main(String[] args) {

        MyThread1 t1 = new MyThread1();
        Thread T1 = new Thread(t1);
        MyThread2 t2 = new MyThread2();
        Thread T2 = new Thread(t2);


        T1.setPriority(6);
        T2.setPriority(10);
        System.out.println(T1.getPriority());
        System.out.println(T2.getPriority());

        T1.start(); 
        System.out.println("Thread 1 state is : "+T1.getState());

//        try {
//            Thread.sleep(200);
//        }catch (InterruptedException e){
//            e.printStackTrace();
//        }
        T2.start();

        System.out.println("Thread 2 state is : "+T2.getState());
        System.out.println(Thread.currentThread().getState());

    }
}
