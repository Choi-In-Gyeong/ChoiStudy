package day0607;

class GStack<T> {
	int tos;
	Object[] stck;

	public GStack() {//������.
		tos = 0;
		stck = new Object[10];
	}

	public void push(T item) {
		if (tos == 10)
			return;
		stck[tos] = item; //1~9���� �ִٰ� 
		tos++;//10 �̵Ǹ� ����.
	}

	public T pop() {
		if (tos == 0)
			return null; //�ƹ��͵� ������ ������ �ִ´�.
		tos--;//9~1���� �� 
		return (T) stck[tos]; // ������ T�� �ٿ�ĳ���� �ؼ� ���������.
	}
}

public class GStackMain {

	public static void main(String[] args) {
		GStack<String> stringStack = new GStack<String>();
		stringStack.push("seoul");//stck[0]
		stringStack.push("busan");//stck[1]
		stringStack.push("LA");//stck[2]
		for (int n = 0; n < 3; n++)
			System.out.println(stringStack.pop());
		
		
		GStack<Integer> intStack = new GStack<Integer>();//Integer ��ü Ÿ���� null�� ����.
		intStack.push(1);//stck[0]
		intStack.push(3);//stck[1]
		intStack.push(5);//stck[2]
		for (int n = 0; n < 3; n++)
			System.out.println(intStack.pop());

	}

}
