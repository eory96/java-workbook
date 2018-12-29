package wa_lab.stepC;

import java.util.Scanner;

public class CalculatePyung4 {
	double m2_area;
	double pyung_area;
	Scanner s = new Scanner(System.in);
	
	CalculatePyung4(){
		input();
	}
	
	public void input() {
		System.out.print("아파트의 분양 면적(제곱미터)을 입력하시오");
		m2_area=s.nextDouble();
		pyung_area =m2_area/3.305;
		System.out.printf("아파트의 평형은 %.1f 이고",pyung_area);
	}
	
	public void result() {
		if(pyung_area<15)
			System.out.print("소형 아파트 입니다.");
		else if(pyung_area>=15&&pyung_area<30)
			System.out.print("중소형 아파트 입니다.");
		else if(pyung_area>=30&&pyung_area<50)
			System.out.print("중형 아파트 입니다.");
		else if(pyung_area>=50)
			System.out.print("대형 아파트 입니다.");
	}
}
