package mar12;

interface in1{
	public int area(int a,int b);
};
interface in2{
	public float area(int r);
};
interface in3{
	public float si(int p,int t,int r);
};
public class lambda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		in1 i1 = (int p,int q)->{
			return p*q;
		};
		int rect_area = i1.area(4, 5);
		
		in2 i2 = (int r)->{
			return (float)22*r*r/7;
		};
		float circle_area = i2.area(1);
		
		in3 i3 = (int p,int t,int r)->{
			return (float)(p*t*r)/100;
		};
		float si = i3.si(1234, 3, 5);
		
		System.out.println("Area of rectangle :"+rect_area);
		System.out.println("Area of circle :"+circle_area);
		System.out.println("Simple intrest :"+si);
	}

}