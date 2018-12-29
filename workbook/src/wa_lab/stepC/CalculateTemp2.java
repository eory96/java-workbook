package wa_lab.stepC;

import java.util.*;

public class CalculateTemp2 {
	double input_degree;
	Scanner s = new Scanner(System.in);
	
	CalculateTemp2(){
		print_result();
	}
	private void print_result() {
		System.out.print("물의 온도를 입력하세요.");
		input_degree = s.nextDouble();
		if(input_degree>=0&&input_degree<25)
			System.out.print("냉수 입니다.");
		else if(input_degree>=25&&input_degree<40)
			System.out.print("미온수 입니다.");
		else if(input_degree>=40&&input_degree<80)
			System.out.print("온수 입니다.");
		else
			System.out.print("끓는물 입니다.");
	}
}
