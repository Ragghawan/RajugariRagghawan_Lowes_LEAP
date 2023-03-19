package jan21;

class C {
    void m3(){
        System.out.println("C");
    }
}
class B extends C{
    void m2(){
        System.out.println("B");
    }
}
public class inheritance extends B implements i1{
	@Override
	public void m4() {
		System.out.println("D");
	}
    void m1(){
        System.out.println("A");
    }
    public static void main(String[] args) {
        inheritance a = new inheritance();
        a.m1();
        a.m2();
        a.m3();
        a.m4();
    }
}