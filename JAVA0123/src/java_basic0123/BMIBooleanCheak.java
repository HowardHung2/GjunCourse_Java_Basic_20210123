package java_basic0123;

public class BMIBooleanCheak {
	public static void main(String[] args) {
            double h = 168.9 ;
            double w = 60.1 ;
            double bmi = w / Math.pow(h/100, 2) ;
            String result = (bmi >= 18.5 && bmi < 24) ? "OK" : "Not stanard" ;
            System.out.printf("\nbmi = %.2f result = %s\n", bmi, result) ;

            String result2 = (bmi < 18.5) ? "Thin" : (bmi >= 24) ? "Fat" : "OK" ;
            System.out.printf("\nbmi = %.2f result2 = %s\n", bmi, result2) ;
	}
}