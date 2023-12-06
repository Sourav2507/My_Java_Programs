package Code_With_Harry_Basic_Java;

class MyThr extends Thread {

    public MyThr (String name){
        super(name);
    }
    public void run(){
        System.out.println("Hello User Good Morning !!");
    }

}

class MyThr2 extends Thread {

    public MyThr2(Runnable r) {
        super(r);
    }
}
public class Multithreading_3{
    public static void main(String[] args) {


        MyThr t1 = new MyThr("Sourav");
        MyThr t2 = new MyThr("Raveesh");
        t1.start();
        t2.start();
//        t1.setPriority(8);
        System.out.println("ID of thread 1 is "+ t1.getId());  //Depricated statement but can be used
        System.out.println("Name of thread 1 is "+ t1.getName());
        System.out.println("ID of thread 1 is "+ t2.getId());  //Depricated statement but can be used
        System.out.println("Name of thread 1 is "+ t2.getName());

        MyThr2 t3 = new MyThr2(t1);  //Runs another thread inside a thread.
        t3.start();
    }
}
