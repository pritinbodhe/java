package polymorphism;

 class car {
	 void run() {
		 System.out.println("running");
	 }
 }

 class innova extends car{
	 void run() {
		 System.out.println("running fast 120km");
	 }
 }
public class runtimepoly {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         car r=new car();
         r.run();
		
		
		car c=new innova();
          c.run();
	}

}
