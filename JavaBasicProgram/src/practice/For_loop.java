package practice;

public class For_loop {

	public static void main(String[] args) {
	/*	// print 0 to 9 hello by using for loop
		for(int i=0;i<10;i++) {
			System.out.println(i + ":hello");
		}
      // 1 to 10 hello
		for(int i=1;i<=10;i++) {
			System.out.println(i+":hello");
		}
		// 1to 100 hello
		for(int i=1;i<=100;++i) {
		System.out.println(i+":hello");}
		
		//100 to 1 hello
		for(int i=100;i>=1;--i) {
			System.out.println(i+":hello");
		}
		//0 to 4 hello
		for(int i=0;i<5;++i) {
			System.out.println(i+":hello");
		}*/
		//10 to 1 hello
		for(int i=10;i>0;--i) {
			System.out.println(i+":hello");
		}
		//print A to Z
		
		for(char c='A';c<='Z';c++) {
			System.out.println(c +" ");
		}
		//print Z to A
		for(char c1='z';c1>='a';--c1) {
			System.out.print(c1 + " ");
		}
		
	}

}
