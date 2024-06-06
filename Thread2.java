
class MyThreadRunnable1 implements Runnable{
        public void run(){
            System.out.println("Thread  1 not Threat 1");
            System.out.println("Thread  1 not Threat 1");
            System.out.println("Thread  1 not Threat 1");
            System.out.println("Thread  1 not Threat 1");
            System.out.println("Thread  1 not Threat 1");
            System.out.println("Thread  1 not Threat 1");
            System.out.println("Thread  1 not Threat 1");
            System.out.println("Thread  1 not Threat 1");
            System.out.println("Thread  1 not Threat 1");
            System.out.println("Thread  1 not Threat 1");
            System.out.println("Thread  1 not Threat 1");
            System.out.println("Thread  1 not Threat 1");
            System.out.println("Thread  1 not Threat 1");
            System.out.println("Thread  1 not Threat 1");
            System.out.println("Thread  1 not Threat 1");
            System.out.println("Thread  1 not Threat 1");
            System.out.println("Thread  1 not Threat 1");
            System.out.println("Thread  1 not Threat 1");
            System.out.println("Thread  1 not Threat 1");
            System.out.println("Thread  1 not Threat 1");
            System.out.println("Thread  1 not Threat 1");
            System.out.println("Thread  1 not Threat 1");
            System.out.println("Thread  1 not Threat 1");
            System.out.println("Thread  1 not Threat 1");
            System.out.println("Thread  1 not Threat 1");
            System.out.println("Thread  1 not Threat 1");
            System.out.println("Thread  1 not Threat 1");
            System.out.println("Thread  1 not Threat 1");
            System.out.println("Thread  1 not Threat 1");
            System.out.println("Thread  1 not Threat 1");
            System.out.println("Thread  1 not Threat 1");
            System.out.println("Thread  1 not Threat 1");
            System.out.println("Thread  1 not Threat 1");
            System.out.println("Thread  1 not Threat 1");
            System.out.println("Thread  1 not Threat 1");
            System.out.println("Thread  1 not Threat 1");
        }
}
class MyThreadRunnable2 implements Runnable{
        public void run(){
            System.out.println("Thread  2 not Threat 2");
            System.out.println("Thread  2 not Threat 2");
            System.out.println("Thread  2 not Threat 2");
            System.out.println("Thread  2 not Threat 2");
            System.out.println("Thread  2 not Threat 2");
            System.out.println("Thread  2 not Threat 2");
            System.out.println("Thread  2 not Threat 2");
            System.out.println("Thread  2 not Threat 2");
            System.out.println("Thread  2 not Threat 2");
            System.out.println("Thread  2 not Threat 2");
            System.out.println("Thread  2 not Threat 2");
            System.out.println("Thread  2 not Threat 2");
            System.out.println("Thread  2 not Threat 2");
            System.out.println("Thread  2 not Threat 2");
            System.out.println("Thread  2 not Threat 2");
            System.out.println("Thread  2 not Threat 2");
            System.out.println("Thread  2 not Threat 2");
            System.out.println("Thread  2 not Threat 2");
            System.out.println("Thread  2 not Threat 2");
            System.out.println("Thread  2 not Threat 2");
            System.out.println("Thread  2 not Threat 2");
            System.out.println("Thread  2 not Threat 2");
            System.out.println("Thread  2 not Threat 2");
            System.out.println("Thread  2 not Threat 2");
            System.out.println("Thread  2 not Threat 2");
            System.out.println("Thread  2 not Threat 2");
            System.out.println("Thread  2 not Threat 2");
            System.out.println("Thread  2 not Threat 2");
            System.out.println("Thread  2 not Threat 2");
            System.out.println("Thread  2 not Threat 2");
            System.out.println("Thread  2 not Threat 2");
            System.out.println("Thread  2 not Threat 2");
            System.out.println("Thread  2 not Threat 2");
            System.out.println("Thread  2 not Threat 2");
            System.out.println("Thread  2 not Threat 2");
            System.out.println("Thread  2 not Threat 2");
            System.out.println("Thread  2 not Threat 2");
            System.out.println("Thread  2 not Threat 2");
            System.out.println("Thread  2 not Threat 2");
            System.out.println("Thread  2 not Threat 2");
            System.out.println("Thread  2 not Threat 2");
            System.out.println("Thread  2 not Threat 2");
            System.out.println("Thread  2 not Threat 2");
            System.out.println("Thread  2 not Threat 2");
            System.out.println("Thread  2 not Threat 2");
            System.out.println("Thread  2 not Threat 2");
            System.out.println("Thread  2 not Threat 2");
            System.out.println("Thread  2 not Threat 2");
            System.out.println("Thread  2 not Threat 2");
        }
}


public class Thread2 {
    public static void main(String[] args) {
        MyThreadRunnable1 bullet1 = new MyThreadRunnable1();
        Thread gun1 = new Thread(bullet1);
        MyThreadRunnable2 bullet2 = new MyThreadRunnable2();
        Thread gun2 = new Thread(bullet2);
       
       
        gun1.start();
        gun2.start();
    }
}
