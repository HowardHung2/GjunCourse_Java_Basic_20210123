package java_basic0123;

public class ConditionalOpt{
	public static void main(String[] args) {
		int i = 2 ;
		boolean cheak = i > 2 && ++i > 0 ;
		System.out.println(cheak) ;
		System.out.println(i) ;
		boolean cheak2 = i > 2 & ++i > 0 ;
		System.out.println(cheak2) ;
		System.out.println(i) ;
	}
}