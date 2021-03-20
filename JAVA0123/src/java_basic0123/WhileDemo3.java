package java_basic0123;

import java .util.Scanner;
public class WhileDemo3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int x = 1;
		while(x <= n){
			int y = 1;
			while(y <= x){
				System.out.printf("@");
				y++;
			}
			System.out.println();
			x++;
		}
	}
}