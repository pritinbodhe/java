package methods;

public class Methodpractice {
	
	public static void getres(int a,int b) {
	int c=a+b;
	System.out.println(c);

	}
	public  void  getres1(int p,int q) {
		int r=p+q;
		 System.out.println(r);
   	  }
	
	public  int  g2(int l,int m) {
		int n=l-m;
		return n;
	}
	
	  public static void main(String[] args) {

    	  Methodpractice.getres(20,22);
    	  Methodpractice v1=new Methodpractice();
    	  v1.getres1(22,22);
    	  System.out.println (v1.g2(12, 13));
    	 
	}

}
