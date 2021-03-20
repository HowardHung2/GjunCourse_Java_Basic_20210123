package java_basic0123;

public class BooleanDemo {
	public static void main(String[] args) {
		int score = 70 ;
		boolean pass = score >= 60 ;
		System.out.printf("score = %d pass = %b \n", score, pass) ;
		// true -> "Pass"
		// false -> "Fail"
		String result = (score >= 60) ? "Pass" : "Fail" ;
		System.out.printf("score = %d result = %s ", score, result) ;
	}
}