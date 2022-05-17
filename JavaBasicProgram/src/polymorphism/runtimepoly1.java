package polymorphism;
           
     class bank{
	public String getratei;

	float getratei() {
		return 0;
	}
      }

       class sbi extends bank{
    	   float getratei() {
    		   return 8.4f;
    	   }
       }

        class icici extends bank{
        	float getratei() {
        		return 7.3f;
        	}
          }

class axis extends bank{
	float getratei() {
		return 9.7f;
	}}
public class runtimepoly1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
             bank b1=new  sbi();
             System.out.println(b1.getratei);
		   b1= new icici();
		   System.out.println(b1.getratei);
		b1=new axis();
		 System.out.println(b1.getratei);
	}

}
