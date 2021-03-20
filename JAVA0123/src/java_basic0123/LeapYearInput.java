package java_basic0123;

import java.util.Scanner ;
public class LeapYearInput{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in) ;
		//閏年條件(二擇一成立) : 可被400整除；可被4整除但不可被100整除
		System.out.print("請輸入西元年份: ");
		int year = sc.nextInt() ;
		String reult = "" ;
		if((year % 400 == 0) || (year % 4 ==0) && (year % 100 != 0)){
			reult = "閏年" ;
		}else{
			reult = "平年" ;
		}
		System.out.printf("您輸入西元 %d 是 %s ", year, reult) ;
	}
}