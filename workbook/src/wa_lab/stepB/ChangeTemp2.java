package wa_lab.stepB;

import java.util.*;

public class ChangeTemp2 {
	double input_degree; 
	String kind;
	double output_degree;
	Scanner s = new Scanner(System.in);
	
	public ChangeTemp2() {
		input();
	}

	public void printA2() {
		if(kind.equals("C")) {
			output_degree = input_degree*1.8+32;
		}else {
			output_degree = (input_degree-32)/1.8;
		}
		System.out.println("변환된 온도는,"+output_degree+"입니다.");
		
	}

	void input() {
		System.out.print("온도를 입력하세요.");
		input_degree= s.nextDouble();
		System.out.print("입력하신 온도가 섭씨온도면 C를, 화씨 온도이면 F를 입력하세요.");
		kind = s.next();
	}
	
	/*double output() {
		f_degree = c_degree * 1.8 + 3.2;
		return f_degree;

	}*/
}
