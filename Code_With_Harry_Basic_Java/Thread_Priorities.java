package Code_With_Harry_Basic_Java;

class MyThr3 extends Thread{
    public MyThr3(String name){
        super(name);
    }
    public void run(){
        while (true){
            System.out.println("Hello learn more about Thread Priorities "+this.getName());
        }
    }
}

public class Thread_Priorities {
    public static void main(String[] args) {

        MyThr3 t1 = new MyThr3("Ravi");
        MyThr3 t2 = new MyThr3("Raju");
        MyThr3 t3 = new MyThr3("Rakesh");
        MyThr3 t4 = new MyThr3("Raveesh");
        MyThr3 t5 = new MyThr3("Raman (MOST IMPORTANT!)");

        t5.setPriority(Thread.MAX_PRIORITY);
        t4.setPriority(Thread.MIN_PRIORITY);
        t3.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);
        t1.setPriority(Thread.MIN_PRIORITY);

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }
}
