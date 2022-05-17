package array;

public class Objectarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//we want to stored multiple kind of value in single then we have to define variable with object typ	
		
		Object b[]= new Object[4];
		
		
		b[0]=10;
		b[1]=20.5;
		b[2]="welcome";
		b[3]=true;
		
	//we have to call this element by usinf for loop
		for(Object i:b) {
			System.out.println(i);
		}
		
		
		
		
		
		
	}

}
