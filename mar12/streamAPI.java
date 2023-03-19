package mar12;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

// Stream APIs
// Allows Functional Style Operations
// That we can perform on String by fetching, filtering and collecting the data
class customer{
	int cid;
	String cName;
	int age;
	public customer(int cid,String cName,int age){
		this.cid = cid;
		this.cName = cName;
		this.age = age;
	}
}
public class streamAPI {
    public static void main(String[] args) {
        List<customer> c1 = new ArrayList<>();
        c1.add(new customer(1, "jaya", 56));
        c1.add(new customer(2, "madhav", 30));
        c1.add(new customer(3, "shyam", 20));
        c1.add(new customer(4, "hari", 15));
        //Filtering fetching and collecting at once
        List<String> cy = c1.stream().filter(c -> c.age > 18 && c.age < 50).map(c -> c.cName).collect(Collectors.toList());
        System.out.println(cy);

        customer cx = c1.stream().max((ca,cb)->ca.age>cb.age?1:-1).get();
        System.out.println(cx.cName);
    }
}