package polymorphism;
 class bike{
	 int speedlimit=90;
 }
 class honda extends bike{
	 int speedlimit=150;
 }
 public class Runtimepoly3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    bike b3=new honda();
    System.out.println(b3.speedlimit);
	}

}
