/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_basic0123;

import java.util.Scanner;
import java.util.Random;

public class GuessNumber {
	public static void main(String[] args) {
		Random r = new Random();
		int ans = r.nextInt(99) + 1 ; //1~99
		int min = 0 ;
		int max = 100 ;
		do{
			// User Guess
			Scanner sc = new Scanner(System.in);
			System.out.printf("User guess [ %2d ~ %2d ] : ", min, max);
			int user_guess = sc.nextInt();
			//check user_guess's range ?
			if (user_guess >= max || user_guess <= min) {
				System.out.printf("%15s\n","Wrong Number !");
			}
			// confirm
			if(user_guess > ans){
				max = user_guess;
			}else if(user_guess < ans){
				min = user_guess;
			}else{
				System.out.printf("\nUser Win !!\n");
				break;
			}

			//-----------------------------------------
			//PC guess
			int pc_guess = r.nextInt(max-min-1)+1+min;
			System.out.printf("  PC guess [ %2d ~ %2d ] : %2d \n", min, max, pc_guess);
			if(pc_guess > ans){
				max = pc_guess;
			}else if(pc_guess < ans){
				min = pc_guess;
			}else{
				System.out.println("PC Win !!");
				break;
			}
		}while(true);
	}
}