package day0609;

import java.util.*;

public class _06_Tokenizer {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		StringTokenizer st = new StringTokenizer(s.nextLine());

		System.out.println("어절 개수는" + st.countTokens());


	}

}
