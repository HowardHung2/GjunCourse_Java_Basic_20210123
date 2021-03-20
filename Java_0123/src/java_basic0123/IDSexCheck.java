package java_basic0123;

//import java.util.Scanner ;
public class IDSexCheck {
	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in) ;
//		System.out.print("請輸入身份證字號: ") ;
//		String id = sc.nextstring() ;
		String id = "A123456789" ;
		char sex = id.charAt(1) ;
		//使用 if-else
		if(sex == '1'){
			System.out.println("生理性別 - 男性") ;
		} else if(sex == '2'){
			System.out.println("生理性別 - 女性") ;
		} else if(sex == '8'){
			System.out.println("生理性別 - 男性  ＊外國") ;
		} else if(sex == '9'){
			System.out.println("生理性別 - 女性  ＊外國") ;
		}
		//使用 switch-case
		//switch 內僅支援 char, byte, short, int, string
		switch(sex){
			case'1':
				System.out.println("生理性別 - 男性") ;
				break ;
			case'2':
				System.out.println("生理性別 - 女性") ;
				break ;
			case'8':
				System.out.println("生理性別 - 男性  ＊外國") ;
				break ;
			case'9':
				System.out.println("生理性別 - 男性  ＊外國") ;
				break ;
			default:
				System.out.println("性別錯誤") ;
				//最後一行可省略 break ;
		}
	}
}