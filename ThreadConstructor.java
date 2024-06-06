class MyTH extends Thread{
public MyTH(String name){
super(name);
}
public void run(){
   System.out.println("Thanks");
}
}

public class ThreadConstructor {
    @SuppressWarnings("deprecation")
    public static void main(String[] args) {
      MyTH t= new MyTH("Aarsh");
      MyTH t2= new MyTH("Ram");
        t.start();
        t2.start();
        System.out.println("Id of THread t "+t.getId());
        System.out.println("Name of THread t "+t.getName());
        System.out.println("Id of THread t2 "+t2.getId());
        System.out.println("Name of THread t2 "+t2.getName());
    }
}
 