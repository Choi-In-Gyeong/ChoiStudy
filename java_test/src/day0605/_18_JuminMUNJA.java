package day0605;
import java.util.Scanner;
public class _18_JuminMUNJA {
	public static void main(String[] args) {
		
		//�ֹι�ȣ�� �Է¹޾� �������� �������� �����Ͽ� ����Ͻÿ�.
		//���ڿ� : �ֹι�ȣ, �����ȣ, ��ȭ��ȣ 
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("�ֹι�ȣ �Է� >>");
		String id = scanner.next();
		
		String s = id.substring(7,8);
//		System.out.println(s);
		
//		- substring(int beginIndex, int endIndex)
//		: beginIndex��ġ���� endIndex �������� ���ڿ� ����
		
		System.out.println("------------------");
	
		if(s.equals("1") || s.equals("3")){
			System.out.println(id + " ����");
		}else if(s.equals("2") || s.equals("4")) {
			System.out.println(id + " ����");
		}
		
		System.out.println("------------------");

//		---------------------------
		int num = Integer.parseInt(s);// ���ڿ��� ���ڿ��� �ٲٴ°�
//		---------------------------
		if(num == 1 || num == 3){
			System.out.println(id + " ����");
		}else if (num == 2 || num == 4) {
			System.out.println(id + " ����");
		}
		
		switch (s) {
		case "1": case "3":
			System.out.println(id + " ����");
			break;
		case "2": case "4":
			System.out.println(id + " ����");
			break;
		default:
		}
		
//===================================================================		
		char ch = id.charAt(7);
		if (ch == '1'|| ch == '3') {
			System.out.println(id + " ����");
		}else if(ch == '2'|| ch=='4') {
			System.out.println(id + " ����");
		}
		
		switch (ch) {
		case '1': case '3':
			System.out.println(id + " ����");
			break;
		case '2': case '4':
			System.out.println(id + " ����");
			break;
		default:
		}//switch-end
	}//main-end
}//class-end

//960205-2152522
//930215-1152325
//123548-3545464


// ���ڿ��� ���ڷ� ��ȯ
// int num = Integer.parseInt(no)
