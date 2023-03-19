package mar12;

interface In1{
	void m1();
}
public class Method_reference_instance_method{
	public void calc(){
		System.out.println("Calling ..");
	}
	public static void main(String[] args){
		// Class object
		Method_reference_instance_method a = new Method_reference_instance_method();
		In1 i1 = a::calc;
		i1.m1();

		// Anonymous object
		In1 i2 = new Method_reference_instance_method()::calc;  // A() -> anonymous object
		i2.m1();
	}
}