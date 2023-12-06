package Code_With_Harry_Basic_Java;

class MyThread4 extends Thread{

    public MyThread4 (String name){
        super(name);
    }
    public void run(){
        System.out.println("Spamming will start in 5 seconds");
//        for (int i = 0;i<300;i++){
//            System.out.println("About to start");
//        }
    }
}

class MyThread5 extends Thread{
    public MyThread5 (String name){
        super(name);
    }
    public void run(){
        int i =0;
//        System.out.println("hello");
        while(i<30){
            try {
                Thread.sleep(500);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
            System.out.println("Here spamming starts !!!");
            i++;
        }
    }
}

public class Thread_Methods {
    public static void main(String[] args) {
        MyThread4 t4 = new MyThread4("Sam");
        MyThread5 t5 = new MyThread5("Sameer");

        t4.start();

//        This statement is used when we want to execte t4 completely before the execution of t5 starts !!

//        try{
//            t4.join();
//        }catch (Exception e){
//            System.out.println(e);
//        }

        try{
            Thread.sleep(5000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }

        t5.start();
    }
}
