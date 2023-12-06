package Code_With_Harry_Practice_Problems;

abstract class pen{

    abstract public void write();

    abstract public void refill();

}

class fountainPen extends pen {
    @Override
    public void write() {
        System.out.println("Writing .......");
    }

    @Override
    public void refill() {
        System.out.println("Refiling .......");
    }

    public void changeNib(){
        System.out.println("Changing the Nib .......");
    }
}

class monkey{

    public void jump(){
        System.out.println("Jumping....");
    }

    public void bite (){
        System.out.println("Biting.....");
    }
}

interface basic_Animal_Characters{
    public void eat();

    public void sleep();
}
class Human extends monkey implements basic_Animal_Characters{

    public void eat(){
        System.out.println("Eating...");
    }

    public void sleep(){
        System.out.println("Sleeping ....");
    }

}

interface tvRemote{

    public void  volumeUP();

    public void  volumedown();

    public void  channelChange();

}

class smartTVRemote implements tvRemote{


    public void  volumeUP(){
        System.out.println("Increasing the Volume !!");
    }

    public void  channelChange(){
        System.out.println("Changing the Channel !!");
    }
    public void  volumedown(){
        System.out.println("Decreasing the Volume !!");
    }
    public void mirrorScreen(){
        System.out.println("Starting Screen Mirroring !!");
    }

    public void openYoutube(){
        System.out.println("Opening YouTube !!");
    }

}

class TV implements tvRemote{

    public void  volumeUP(){
        System.out.println("Increasing the Volume !!");
    }

    public void  channelChange(){
        System.out.println("Changing the Channel !!");
    }
    public void  volumedown(){
        System.out.println("Decreasing the Volume !!");
    }

}

public class Chapter_11_Practice_Set {
    public static void main(String[] args) {

        fountainPen obj = new fountainPen();

        obj.write();
        obj.refill();
        obj.changeNib();

        System.out.println();
        Human H = new Human();

        H.eat();
        H.sleep();
        H.bite();
        H.jump();

        System.out.println();
        monkey obj2 = new Human();
        obj2.bite();
        obj2.jump();

        System.out.println();
        smartTVRemote rem1 = new smartTVRemote();
        tvRemote rem2 = new smartTVRemote();

        rem1.volumeUP();
        rem1.volumedown();
        rem1.channelChange();
        rem1.mirrorScreen();
        rem1.openYoutube();

        System.out.println();

        rem2.volumeUP();
        rem2.volumedown();
        rem2.channelChange();


        System.out.println("\nFor Class TV\n");
        TV teleV = new TV();

        teleV.volumedown();
        teleV.volumeUP();
        teleV.channelChange();

    }
}
