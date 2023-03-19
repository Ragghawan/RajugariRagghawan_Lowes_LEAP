package feb11;

public class MultiThreading_2 extends Thread{
    public static void main(String[] args){
        MultiThreading_2 a = new MultiThreading_2();
        a.setPriority(MAX_PRIORITY);
        a.setName("Thread_name");
        System.out.println(a.getPriority());
        System.out.println(a.getName());
    }
}