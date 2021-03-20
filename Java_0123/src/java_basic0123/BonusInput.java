package java_basic0123;

import java.util.Scanner ;
public class BonusInput{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in) ;
		System.out.print("請輸入你的考績分數: ") ;
		int score = sc.nextInt() ;
		switch(score/10){
			case 10:
			case 9:
				System.out.println("拿 6 個月年終獎金，外加 BMW 一台(含車位)") ;
				break ;
			case 8:
			case 7:
				System.out.println("500元紅包，買樂透用~") ;
				break ;
			default:
				System.out.println("請過年好好思考是否要繼續待在本公司~") ;
		}
	}
}