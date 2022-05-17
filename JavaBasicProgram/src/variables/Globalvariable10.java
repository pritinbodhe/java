package variables;

public class Globalvariable10 {
	int empid;
	static double salary;
	
	public static void main(String[] args) {
		 
		System.out.println("####access to sgv######");
		System.out.println(salary);//
		System.out.println(Globalvariable10.salary);
		//access for non static global variable
		//1) create object of class
		 Globalvariable10 g1=new Globalvariable10();
		 
		 System.out.println(g1.empid);

	}

}
