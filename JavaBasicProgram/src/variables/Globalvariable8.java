package variables;

public class Globalvariable8 {
	
	int empid=123;//non static gv

	public static void main(String[] args) {
		Globalvariable8 g1= new Globalvariable8();//we have create object of class
		
		System.out.println(g1.empid);
		g1.empid=456;//update non static gv
		System.out.println(g1.empid);
		
		

	}

}
