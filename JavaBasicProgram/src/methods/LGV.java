package methods;

public class LGV {
	        static int empid,age=35;
	        double salary=25000;
	        int air=23;
	        public static int callA(int a,int b) {
	        	int  c=a*b;
	          return c;
	      
	        
	        }
	        static int callB(int p,int q) {
	        	int r=p+q;
	        	return r;
	        	
	        }	 
	        
	       static int callc(int acc) {
	           
	       return acc=100;
	       }
	       public int callD(int pin) {
	    	   pin=400;
	    	   return 400;	  
	    	     }
       public static void main(String[]args) {
	    int age=25;
	    System.out.println (LGV.callA(12,12));
	    System.out.println(age);
	    System.out.println(LGV.age);
	    LGV v1=new LGV();
	    System.out.println(v1.salary);
	    System.out.println(v1.air);
	   // System.out.println(LGV.callB(15,15));
	    System.out.println(LGV.callc(100));	    
	    System.out.println(LGV.callB(23, 23));
	
	
	

	}
	}


