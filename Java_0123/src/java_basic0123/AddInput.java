package java_basic0123;

import java.util.Scanner;

public class AddInput{
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in) ;
	System.out.print("請輸入一個數字 : ") ;
	int x = sc.nextInt() ; //取得使用者輸入的數字
	System.out.print("請再輸入一個數字 : ") ;
	int y = sc.nextInt() ; //取得使用者所輸入的數字
	int sum = x + y ;
	System.out.printf("%d + %d = %d \n" , x, y, sum) ;
	}
}
