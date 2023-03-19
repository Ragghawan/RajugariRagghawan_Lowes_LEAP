package mar11;

import java.util.Date;
import java.util.Scanner;
import java.util.Random;
public class DateRandomScanner {
    public static void main(String[] args) {
        Date d = new Date();
        Random r = new Random();
        Scanner sc = new Scanner(System.in);

        int sal = sc.nextInt();
        String eName = sc.next();

        System.out.println(eName +" "+ r.nextInt(10000)+" "+ sal +" "+ d);
        sc.close();
    }
}