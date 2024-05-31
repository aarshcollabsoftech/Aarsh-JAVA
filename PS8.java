abstract class Pen {

    abstract void write();

    abstract void refill();
}
abstract class Telephone {

    abstract void ring();
    abstract void lift();
    abstract void disconnect();

}
class SmartPhone extends Telephone{
    @Override
    void ring(){
        System.out.println("Ringing...");
    }
    @Override
    void lift(){
        System.out.println("Lifting...");
    }
    @Override
    void disconnect(){
        System.out.println("Disconnecting...");
    }
    void openGPS(){
        System.out.println("Opening Maps");
    }
}
class FountainPen extends Pen {
    void write() {
        System.out.println("Writing");
    }

    void refill() {
        System.out.println("Refilling");
    }

    void changeNib() {
        System.out.println("Changing the nib");
    }
}

class Monkey {
    void jump() {
        System.out.println(" Jumping");
    };

    void bite() {
        System.out.println("Biting..");
    };
}

interface BasicAnimal {
    void eat();

    void sleep();
}

class Human extends Monkey implements BasicAnimal {
    void speak() {
        System.out.println("Speaking");
    }
    @Override
    public void sleep(){
        System.out.println("Sleeping");
    }
    @Override
    public void eat(){
        System.out.println("Eating");
    }
}

public class PS8 {
    public static void main(String[] args) {
        
        // FountainPen pen = new FountainPen();
        // pen.changeNib();

        // Human aarsh = new Human();
        // aarsh.sleep();
        Telephone t1 = new SmartPhone();
        // t1.openGPS();  error giving polymorphism
        SmartPhone vivo = new SmartPhone();
        vivo.ring();
        vivo.lift();
        vivo.disconnect();

        //Q5

        Monkey m1 = new Human();
        // m1.speak();  will give error because the reference is monkey which does not have speak method
       m1.jump();
       m1.bite();
        BasicAnimal BA1 = new Human();
        // BA1.speak(); error giving polymorphism
        BA1.eat();
        BA1.sleep();

    }
}
