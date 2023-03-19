package mar12;

interface transaction{
	void status();
}
public class Method_reference_static_method{
	public static void msgStatus(){
		System.out.println("static method reference");
	}
	public static void main(String [] args) throws Exception{
		transaction t = Method_reference_static_method::msgStatus;
		t.status();
	}
}