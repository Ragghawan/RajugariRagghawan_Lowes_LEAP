package feb5;

public class ExceptionHandling {
    public static void main(String[] args) {
        try{
            int i = 10,j = 0,k;
            k = i/j; 
            System.out.println(k);
        }
        catch(ArrayIndexOutOfBoundsException a){
            a.printStackTrace();
            System.out.println("Catch-1");
        }
        catch(NumberFormatException e){
            e.printStackTrace();
            System.out.println("Catch-2");
        }
        catch(NullPointerException n){
            n.printStackTrace();
            System.out.println("Catch-3");
        }
        catch(ArithmeticException a){
            a.printStackTrace();
            System.out.println("Catch-4");
        }
        // Below has to be declared after every catch, due to Rule2:always super class exception followed by subclass exception
        catch(Exception e){
            e.printStackTrace();
            System.out.println("Catch-5");
        }
        finally{
            System.out.println("finally");
        }
    }
}