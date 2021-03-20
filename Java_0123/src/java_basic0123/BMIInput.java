package java_basic0123;

import java.util.Scanner ;
public class BMIInput {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in) ;
		System.out.print("請輸入身高(公分) : ") ;
		double h = sc.nextDouble() ;
		System.out.print("請輸入體重(公斤) : ") ;
		double w = sc.nextDouble() ;
		//計算BMI
		double bmi = w / Math.pow(h/100, 2) ;
		System.out.printf("身高: %.1f  體重: %.1f  BMI: %.2f \n", h, w, bmi) ;
		//判斷
		String result = "" ;
		if(bmi >= 24){
			result = "過重" ;
		}else if(bmi < 18){
			result = "過輕" ;
		}else {
			result= "正常" ;
		}
		System.out.printf("判斷結果 : %s \n", result) ;
	}
}
