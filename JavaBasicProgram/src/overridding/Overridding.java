package overridding;

      class A{
    	  public void move() {
    	        System.out.println("A can move");
    	  }
      }
 class B extends A {
	 public void move() {
	        System.out.println("B can move");
	        
	 }
 }
     public class Overridding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         A a=new A();
         a.move();
         B b=new B();
         b.move();
         
		
		
	}

}
