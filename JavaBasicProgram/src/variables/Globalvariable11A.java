package variables;

public class Globalvariable11A {
//global variable:static and non static
	static int rollnum=456;
	static boolean result;
	double payment=4500;
	char grade;
	
	public static void main(String[] args) {
		//access to static variable
		System.out.println("SGV is:"+rollnum);//456
		//access non static member
		System.out.println("sgv:"+result);//false
		
		//access to non static 
		
		Globalvariable11A a=new Globalvariable11A();
		System.out.println("access to nsgv:"+a.payment);//4500
		System.out.println("acess to nsgv:"+a.grade);//blank 
		//update the value of static 
		rollnum=500;
		result=true;
		//access to sv
		System.out.println(rollnum);//500
		System.out.println(result);//true
		//update the value of nsgv
		a.payment=5433.33;
		a.grade='A';
		System.out.println(a.payment);//5433.33
		System.out.println(a.grade);//A
		
		
		
		
		
		
		


	}

}
