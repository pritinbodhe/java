package overridding;

class ABC{
	
	public void mymethod() {
		System.out.println("ABC");
	}
}
class DEF extends ABC{
	
	public void mymethod() {
		super.mymethod();
	
		System.out.println("DEF");
	}
}

public class Override {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          DEF q=new DEF();
          q.mymethod();
	}

}
