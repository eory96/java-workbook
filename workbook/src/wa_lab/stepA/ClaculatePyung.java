package wa_lab.stepA;

import java.util.*;

public class ClaculatePyung {
	private double m2_area;
	private double pyung_area;

	public ClaculatePyung() {input();}
	public void printA4() {
		System.out.println("아파트의 평형은"+output()+"입니다.\n");
	}

	void input() {
		Scanner s = new Scanner(System.in);
		System.out.print("아파트의 분양면적을 입력하시오.\n");
		m2_area = s.nextDouble();
	}

	double output() {
		pyung_area = m2_area / 3.305;
		return pyung_area;
	}
}
