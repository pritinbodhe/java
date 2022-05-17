package practice;

public class Me1 {
	
	static int empid,age=25;
	double salary=25000;
	
	public static void callA() {
	System.out.println("A");
	}
	void callB() {
		System.out.println("B");
	}
	static void callC(int x) {
		System.out.println("X");
	
	}
	static double callD(double y) {
		System.out.println("y");
		return  y;
	}
	

	public static void main(String[] args) {
		int age1;
		age1=25;
		Me1 m1=new Me1();
		Me1.callA();
		m1.callB();
		Me1.callC(45);
		//Me1.callD(23333);
		System.out.println(Me1.callD(23333));
		//System.out.println(Me1.callD(2222.2));
		System.out.println(age1);
	}

}
