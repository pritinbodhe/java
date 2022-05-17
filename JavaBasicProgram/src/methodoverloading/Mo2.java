package methodoverloading;

public class Mo2 {
	           
	        public void square() {
	        	System.out.println("no parameter called");
	        }
	        public void square(int a) {
             int square=a*a;
	        System.out.println(square);
	        }
	        
	        public void square(float a) {
	        	float square=a*a;
	        	System.out.println(square);
	        }
	        
	    public static void main(String[] args) {
		          Mo2 m2=new Mo2();
		          m2.square();
		          m2.square(5);
		          m2.square(2.5f);
		          

	}

}
