package day0605;
import java.util.Scanner;
public class _18_JuminMUNJA {
	public static void main(String[] args) {
		
		//주민번호를 입력받아 남자인지 여자인지 판정하여 출력하시오.
		//문자열 : 주민번호, 우편번호, 전화번호 
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("주민번호 입력 >>");
		String id = scanner.next();
		
		String s = id.substring(7,8);
//		System.out.println(s);
		
//		- substring(int beginIndex, int endIndex)
//		: beginIndex위치부터 endIndex 직전까지 문자열 발췌
		
		System.out.println("------------------");
	
		if(s.equals("1") || s.equals("3")){
			System.out.println(id + " 남자");
		}else if(s.equals("2") || s.equals("4")) {
			System.out.println(id + " 여자");
		}
		
		System.out.println("------------------");

//		---------------------------
		int num = Integer.parseInt(s);// 문자열을 숫자열로 바꾸는거
//		---------------------------
		if(num == 1 || num == 3){
			System.out.println(id + " 남자");
		}else if (num == 2 || num == 4) {
			System.out.println(id + " 여자");
		}
		
		switch (s) {
		case "1": case "3":
			System.out.println(id + " 남자");
			break;
		case "2": case "4":
			System.out.println(id + " 여자");
			break;
		default:
		}
		
//===================================================================		
		char ch = id.charAt(7);
		if (ch == '1'|| ch == '3') {
			System.out.println(id + " 남자");
		}else if(ch == '2'|| ch=='4') {
			System.out.println(id + " 여자");
		}
		
		switch (ch) {
		case '1': case '3':
			System.out.println(id + " 남자");
			break;
		case '2': case '4':
			System.out.println(id + " 여자");
			break;
		default:
		}//switch-end
	}//main-end
}//class-end

//960205-2152522
//930215-1152325
//123548-3545464


// 문자열을 숫자로 변환
// int num = Integer.parseInt(no)
