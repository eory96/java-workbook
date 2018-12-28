package wa_lab.stepB;

import java.util.*;

public class CalculatePyung4 {
	double m2_area;
	double pyung_area;
	Scanner s = new Scanner(System.in);
	
	CalculatePyung4(){
		print_result();
	}
	
	public void print_result() {
		System.out.print("아파트의 분양 면적(제곱미터)을 입력하시오");
		m2_area=s.nextDouble();
		pyung_area = result(m2_area);
		System.out.println("아파트의 평형은 "+pyung_area+"이고 ");
		if(pyung_area<30) {
			System.out.print("30평 미만이므로 작은 아파트 입니다.");
		}else {
			System.out.print("30평 이상이므로 큰 아파트 입니다.");
		}
	}
	
	private double result(double m2_area) {
		double res;
		res = m2_area/3.305;
		return res;
		
	}
}
