package inheritance;
//hierarchical inheritance
 class vehical{
 public void wheel() {
 System.out.println("wheel");
        	  }
          }

class bike extends vehical{
	public void bikewheel() {
		System.out.println("bikewheel");
	}
}
class car extends vehical{
	public void carwheel() {
		System.out.println("carwheel");
	}
}
class scooter extends vehical{
	public void scooterwheel() {
		System.out.println("scooterwheel");
	}
}
public class Inheritance2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           
		scooter s=new scooter();
		s.wheel();
		s.scooterwheel();
		
		car c=new car();
		c.carwheel();
		c.wheel();
		//c.bikewheel();//not possible
	}

}
