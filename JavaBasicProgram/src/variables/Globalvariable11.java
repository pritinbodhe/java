package variables;

public class Globalvariable11 {
	//global variable static non static
	static int rollno=456;
	static boolean result;
	double payment=4500.56;
	char grade;
	
	public static void main(String[] args) {
		//access to static 

		System.out.println(rollno);
		System.out.println(result);
		//access non static gv
		
		Globalvariable11 g1=new Globalvariable11();
		System.out.println(g1.payment);
		System.out.println(g1.grade);
		//update value of static and non static v
		
		rollno=500;
		result=true;
		g1.payment=5422.22;
		g1.grade='A';
		
		System.out.println(rollno);
		System.out.println(result);
		System.out.println(g1.payment);
		System.out.println(g1.grade);
		
		

	}

}
