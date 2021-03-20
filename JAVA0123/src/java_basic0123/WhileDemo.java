package java_basic0123;

import java.util.Random;

public class WhileDemo{
	public static void main(String[] args) {
		Random r = new Random();
		while(true) {
			int n = r.nextInt(100);
			System.out.println(n); // 0~99
			if(n == 99){
				break;
			}
		}
	}
}