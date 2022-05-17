package variables;

public class Globalvariable9 {
     int empid=123;//non static gv
     int age= 23;
	public static void main(String[] args) {
		Globalvariable9 g1= new Globalvariable9();
		System.out.println(g1.empid);
		//update nsv
		g1.empid=456;
		System.out.println(g1.empid);
		//creating new object class
		
		Globalvariable9 g2=new Globalvariable9();
		System.out.println(+g2.age);
	}

}
