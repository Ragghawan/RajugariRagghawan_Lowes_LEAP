package feb11;

public class Sleep extends Thread{
    @Override
    public void run(){
        for(int i=0;i<=5;i++){
            try{
                Thread.sleep(2000);//prints i after these many mili seconds
            }
            catch(Exception e){
                e.printStackTrace();
            }
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        Sleep a = new Sleep();
        a.start();
    }
}