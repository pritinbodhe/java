package inheritance;

 class A1{
	 static int a=10;
	 int b =33;
 }
 class B1 extends A1{
	 static int x=30;
	 int y=22;
	
 }

class C1 extends B1{
	static int p=50;
	double q=44;
}
public class Inheritance1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(A1.a); //SGV
		System.out.println(B1.x);//SGV
		System.out.println(C1.p);//SGV
		 
		C1 c=new C1();
		System.out.println(c.b);
		System.out.println(c.y);
		System.out.println(c.q);
		
		B1 b=new B1();
		System.out.println(b.b);
		System.out.println(b.y);
	}

}
