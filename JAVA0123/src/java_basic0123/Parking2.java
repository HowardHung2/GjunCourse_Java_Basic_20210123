package java_basic0123;

import java.util.Scanner;
public class Parking2{
	public static void main(String[] args) {
		int park = 0b101010 ;
		System.out.printf("目前車位狀態: %s \n", Integer.toBinaryString(park)) ;
		Scanner sc = new Scanner(System.in) ;
		System.out.print("請輸入出車停車位編號[4, 3, 2, 1, 0] ==> ") ;
		int n = sc.nextInt() ;
		//檢查是否該車會可以出車
		int check = park & (int)Math.pow(2, n) ;
		switch(check){
			default:
				System.out.printf("%d 號車位可出車\n", n) ;
				//把車子開進去
				park -= (int)Math.pow(2, n) ;
				break ;
			case 0:
			System.out.printf("%d 號車位沒有車可以出\n", n) ;
		}
	}
}