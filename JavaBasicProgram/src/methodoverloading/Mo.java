package methodoverloading;

public class Mo {  
	      static double res;
	      
	      static public void square() {
	    	  System.out.println("no of parameter called");
	      }
	      static public void square (int num) {
	    	  res=num*num;
	    	  System.out.println(res);
	      }
	      static public void square(double num) {
	    	  res=num*num;
	    	  System.out.println(res);
	      }
	      
	       public static void main(String[] args) {
	    	   System.out.println(res);
	    	   Mo.square();
	    	   Mo.square(5);
	    	   Mo.square(2.5f);    	
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	    	

	}

}
