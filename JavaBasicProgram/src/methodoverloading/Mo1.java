package methodoverloading;

public class Mo1 {
	         int addnum(int num1,int num2) {
	        return num1+num2;
		    }
	         int addnum() {
	        	 int num1=10,num2=20;
	        	 return num1*num2;
	         }
	         int addnum(int a,int b,int c) {
	        	 int d=a*b*c;
	        	 return d;
	        
	        	 
	         }
	         
	        public static void main(String[] args) {
	        	Mo1 m1=new Mo1();
	      System.out.println(m1.addnum(25,55));
		 System.out.println(m1.addnum());
		 System.out.println(m1.addnum(25,55,88));

	}

}
