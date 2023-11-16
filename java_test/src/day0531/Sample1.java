package day0531;

import day0530.ClassA;//다른패키지 갖다쓸때, 임포트해줘야함.

public class Sample1 extends ClassA{
	void test(){
		a = 100;
//		b = 100;//디폴트
		c = 100;//상속받으면 사용가능.
//		d = 100;//private
	}
}
