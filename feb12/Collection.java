package feb12;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
public class Collection {
    public static void main(String[] args) {
        //Set:Does not store duplicates and sorts data
        HashSet<String>h = new HashSet<>();
        h.add("g");
        h.add("m");
        h.add("a");
        h.add("m");
        Iterator<String> i = h.iterator();
        while(i.hasNext()){
            String s = i.next();
            System.out.println(s);
        }

        //ArrayList: allows duplicate and maintains insertion order
        ArrayList<String> a = new ArrayList<>();
        a.add("g");
        a.add("m");
        a.add("a");
        a.add("m");
        Iterator<String> ia = a.iterator();
        while(ia.hasNext()){
            String s = ia.next();
            System.out.println(s);
        }

        //LinkedList:Similar to arraylist
        LinkedList<String> l = new LinkedList<>();
        l.add("g");
        l.add("m");
        l.add("a");
        l.add("m");
        Iterator<String> il = l.iterator();
        while(il.hasNext()){
            String s = il.next();
            System.out.println(s);
        }

        //HashMap:sorts ,allows multiple null values,but single null key
        HashMap<Integer,String> hm = new HashMap<>();
        hm.put(1,"java");
        hm.put(2,"python");
        hm.put(0,"cpp");
        for(Map.Entry<Integer,String> m: hm.entrySet()){
            System.out.println(m);
        }
        
    }
}