class MyThr1 extends Thread{

    public MyThr1(String name){
        super(name);
    }
    public void run(){
     while (true) {
        
         System.out.println("Thankyou "+this.getName());
     }
    }
}




public class ThreadPriorities {
   public static void main(String[] args) {
    // Ready Queue : T1 T2 T3 T4 T5
    // Min priority => 1
    // Normal priority => 5
    // Max priority => 10

    MyThr1 t1 = new MyThr1("Aarsh");
    MyThr1 t2 = new MyThr1("Deval");
    MyThr1 t3 = new MyThr1("Rushit");
    MyThr1 t4 = new MyThr1("Gautam");
    MyThr1 t5 = new MyThr1("Tarun");
    t5.setPriority(Thread.MAX_PRIORITY);
    t1.setPriority(Thread.MIN_PRIORITY);
    t1.start();
    t2.start();
    t3.start();
    t4.start();
    t5.start();
}

}
