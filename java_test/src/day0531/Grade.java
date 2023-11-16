package day0531;

public class Grade {
	private int math;
	private int science;
	private int english;

	Grade(int m, int s, int e) {
		math = m;
		science = s;
		english = e;
	}

	double average() {
		return (math + science + english) / 3;
		

	}
}
