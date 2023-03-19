package mar12;

class statement{
	public statement(String status){
		System.out.println(status);
	}
}

interface transaction{
	statement getTrx(String status);
}

public class Method_reference_constructor{
	public static void main(String [] args) throws Exception{
		transaction t = statement::new;
		t.getTrx("Trx success !!");
	}
}