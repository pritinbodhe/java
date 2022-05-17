package methodoverloading;

public class Mo0 {
	             static int addnum(int num1,int num2) {
	             return num1+num2;
	             } 
	             
	             static double addnum(int num1,double num2) {
	            	 return num1*num2;
	            	 
	             }
	             static int addnum(int num1,int num2,int num3) {
	            	 return num1*num2*num2;
	             } 
	             
	            
	             
	         
	            public static void main(String[] args) {
	             
	            	System.out.println(addnum(40,40));
	            	System.out.println(Mo0.addnum(4,3.3));
	            	System.out.println(Mo0.addnum(2,2,3));
	}

}
