package feb11;

public class MultiThreading implements  Runnable{
    public void run(){
        System.out.println("Thread Running");
    }
    public static void main(String[] args){
        MultiThreading a = new MultiThreading();
        Thread t = new Thread(a); // Thread class object is created because we do not extedn Thread class.
        t.start(); // Whenever start() method is called by thread, run() method is invoked.
        System.out.println("Started");
    }
}
