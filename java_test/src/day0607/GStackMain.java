package day0607;

class GStack<T> {
	int tos;
	Object[] stck;

	public GStack() {//생성자.
		tos = 0;
		stck = new Object[10];
	}

	public void push(T item) {
		if (tos == 10)
			return;
		stck[tos] = item; //1~9까지 넣다가 
		tos++;//10 이되면 리턴.
	}

	public T pop() {
		if (tos == 0)
			return null; //아무것도 없을때 데이터 넣는다.
		tos--;//9~1까지 뺌 
		return (T) stck[tos]; // 리턴형 T로 다운캐스팅 해서 보내줘야함.
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
		
		
		GStack<Integer> intStack = new GStack<Integer>();//Integer 객체 타입은 null이 가능.
		intStack.push(1);//stck[0]
		intStack.push(3);//stck[1]
		intStack.push(5);//stck[2]
		for (int n = 0; n < 3; n++)
			System.out.println(intStack.pop());

	}

}
