package variables;

public class Globalvariable5 {
	
	static int empid=123;//gsv
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int age=30;//local variable
      int empid=800;//local variable
      age=45;
      age=55;//update lv
      empid=400;//update lv
		System.out.println(age);//access lv
		System.out.println(empid);//acces lv
		System.out.println(+Globalvariable5.empid);//access gsv
		Globalvariable5.empid=999;//update sgv
		System.out.println("updated way to access sgv:"+Globalvariable5.empid);
		
		
	}

}
