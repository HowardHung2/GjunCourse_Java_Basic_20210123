package java_basic0123;

public class MathOpt{
	public static void main(String[] args) {
		System.out.println(1.0 == 1) ;
		System.out.println(0.1+0.1 == 0.2) ;
		System.out.println(0.1+0.1+0.1) ;
		int x = 7 ;
		System.out.println(x % 2) ;
		String result = (x % 2 == 0) ? "even" : "odd" ;
		System.out.printf("%d is %s\n", x, result) ;
		int age = 10 ;
		int var = ++age + age-- ;
		System.out.printf("age = %d, var = %d \n", age, var) ;
		int age2 = 10 ;
		int var2 = age-- - --age ;
		System.out.printf("age2 = %d, var2 = %d \n", age2, var2) ;
		int age3 = 0 ;
		age3 = age3 ++ ;
		System.out.printf("age3 = %d \n", age3 );
	}
}