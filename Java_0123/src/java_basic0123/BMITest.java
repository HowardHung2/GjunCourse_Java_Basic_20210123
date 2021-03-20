package java_basic0123;

public class BMITest {
	public static void main(String[] args) {
		double h = 168.9 ;
		double w = 60 ;
		double bmi = w / ((h/100)*(h/100)) ;
		System.out.printf("h = %.1f w = %.1f bmi = %.2f\n", h, w, bmi) ;
		//System.out.println(h) ;
	}
}
