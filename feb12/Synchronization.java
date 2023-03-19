package feb12;

class Deploy{
    synchronized void app(int duration){
        for(int i=0;i<=5;i++){
            System.out.println(i*duration);
            try{
                Thread.sleep(2000);
            }
            catch(Exception e){
                e.printStackTrace();
            }
        }
    }
};
class Client1 extends Thread{
    Deploy d;
    Client1(Deploy d){
        this.d = d;
    }
    @Override
    public void run(){
        d.app(5);
    }
};
class Client2 extends Thread{
    Deploy d;
    Client2(Deploy d){
        this.d = d;
    }
    @Override
    public void run(){
        d.app(10);
    }
};
public class Synchronization {
    public static void main(String[] args) {
        Deploy d = new Deploy();
        Client1 c1 = new Client1(d);
        Client2 c2 = new Client2(d);
        c1.start();
        c2.start();
    }
}