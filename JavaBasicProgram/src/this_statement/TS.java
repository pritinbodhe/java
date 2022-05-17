package this_statement;

public class TS {
	
	   TS(){
		   this('c',25.33);
		   System.out.println("zero para");
			 }
	
	TS(int age){
		System.out.println("int para");
		
	}
	TS(char c,double d){
		this(25);
		System.out.println("char doublepara");
		
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        TS T1=new TS();
	}

}
