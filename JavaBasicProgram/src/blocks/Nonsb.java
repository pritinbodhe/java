package blocks;

public class Nonsb {
	
	{	System.out.println("nsb");//non static block
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("main method");
		Nonsb s1=new Nonsb();
		System.out.println("........");
		Nonsb s2=new Nonsb();
		System.out.println("main end");
		
		
	}

}
