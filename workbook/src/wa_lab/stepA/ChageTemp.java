package wa_lab.stepA;

import java.util.*;

public class ChageTemp {
	double c_degree;
	double f_degree;

	public ChageTemp() {input();}

	public void printA2() {
		System.out.println("화씨온도는,"+output()+"입니다.\n");
	}

	void input() {
		Scanner s = new Scanner(System.in);
		System.out.print("섭씨온도 입력하세요..\n");
		c_degree = s.nextDouble();
	}
	double output() {

		f_degree = c_degree * 1.8 + 3.2;

		return f_degree;

	}
}
