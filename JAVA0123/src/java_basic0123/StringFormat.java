package java_basic0123;

public class StringFormat {

	public static void main(String[] args) {
		int x = 54321 ;
		double y = 3.1415926 ;
		double sum = x + y ;
		System.out.println(x) ;
		System.out.println(y) ;
		System.out.println(sum) ;
		System.out.println("x=" + x) ;
		System.out.println("y=" + y) ;
		System.out.println("x=" + x + " y=" + y) ;
		System.out.printf("x=%,d\n", x ) ;
		System.out.printf("y=%.2f\n", y) ;
		System.out.printf("x=%,d y=%.2f\n", x, y) ;
	}
}