/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_basic0123;

import java.util.Scanner ;
/*
 * 100    -> A
 * 90~99  -> A
 * 80~89  -> B
 * 70~79  -> C
 * 60~69  -> D
 * 59以下 -> E
*/
public class ScoreLevelInput{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in) ;
		System.out.print("請輸入分數 : ") ;
		int score = sc.nextInt() ;
		// 先確認分數是否在0~100之間
		if(score < 0 || score > 100){
			System.out.println("分數需介於0-100之間") ;
			return ; // 中斷main方法
		}
		// 再判斷等第
		if(score == 100){
			System.out.println("等第: A") ;
		}else if(score >= 90 && score <= 99){
			System.out.println("等第: A") ;
		}else if(score >= 80 && score <= 89){
			System.out.println("等第: B") ;
		}else if(score >= 70 && score <= 79){
			System.out.println("等第: C") ;
		}else if(score >= 60 && score <= 69){
			System.out.println("等第: D") ;
		}else {
			System.out.println("等第: E") ;
		}
	}
}