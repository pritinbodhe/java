package practice;

public class Mo {
	   
	public void square() {
		System.out.println("no para");
	}
	public void square(int num) {
		System.out.println("int para");
	}
	public double square(double num) {
		System.out.println("float para");
		return num;
	}
	static int square(int a,int b) {
		System.out.println("int para");
		return a+b;
	}
	
	int square(int a,int b,int c) {
		System.out.println("inn para");
		return (a+b)*c;
	}   
	void square(int a,int b,int c,int d) {
		System.out.println("void para");
	}
	
	static void square1() {
		System.out.println("zero para");
	}

	static  int square1(int x,int y) {
		System.out.println("z para");
		return x/y;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Mo m1=new Mo();
         m1.square();
         m1.square(44);
         System.out.println(m1.square(44.4f));
         System.out.println(Mo.square(22, 23));
         System.out.println(m1.square(22,22,22));
         m1.square(22,22,2,2);
         Mo.square1();
         System.out.println(Mo.square1(22,22));
	}

}
