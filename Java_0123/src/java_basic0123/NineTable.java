package java_basic0123;

public class NineTable{
	public static void main(String[] args) {
		int n = 9;
		if(args.length > 0){
			n = Integer.parseInt(args[0]);
		}
		for (int x = 1 ; x<=n ; x++) {
			for(int y = 1 ; y<=n ; y++){
				System.out.printf("%3dx%3d=%3d  ", x, y,(x*y));
			}
			System.out.println();
		}
	}
}