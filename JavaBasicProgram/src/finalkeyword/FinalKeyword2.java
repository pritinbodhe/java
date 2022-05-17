package finalkeyword;

public class FinalKeyword2 {
	
	
	final int speedlimit;// blank final variable
	
	FinalKeyword2(int a) 
	{   //nsgc 1st declared then initialize w t help of constuctor
		speedlimit = 70;
		
		System.out.println(speedlimit);
	}
	public static void main(String args[]) {
		
		FinalKeyword2 f1=new FinalKeyword2(22);
		
		System.out.println(f1.speedlimit); 
	}
}

