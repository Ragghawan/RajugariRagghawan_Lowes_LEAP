package feb5;

public class constructor {
	int eid;
	String eName;
	public constructor(int eid, String eName) {
		this.eid = eid;
		this.eName = eName;
	}
	void show() {
		System.out.println(eid+" "+eName);
	}
	public static void main(String[] args) {
		constructor c = new constructor(2,"Ragghawan");
		c.show();
	}
}
