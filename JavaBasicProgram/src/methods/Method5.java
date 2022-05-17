package methods;

public class Method5 {
 public static double getintrest(int p,double r,int t) {
	 
	 return(p*r*t)/100;
 }
 
public static double getintrest1(int p,double r,int t) {
	 double a=(p*r*t)/100;
	 return a;
}
	public static void getintrest2(int p,double r,int t) {
		double a=(p*r*t/100);
		System.out.println("intrest is :"+a);
	}
	
	
	public static void main(String[] args) {
	
		System.out.println("get intrest using getintrest:"+Method5.getintrest(25000,6.5,60));
		System.out.println(+Method5.getintrest1(25000,6.5,60));
		
		Method5.getintrest2(350000,5,36);
		double a=Method5.getintrest(250000,6.5,6);
		System.out.println(a);
		
		
		
		
		
		
		
		
		
	}

}
