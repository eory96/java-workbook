package wa_lab.stepB;

import java.util.*;

public class CalculateBMI9 {

	int height, weight; // 신장(cm), 체중(kg)
	int bmi;
	Scanner s = new Scanner(System.in);
	
	CalculateBMI9(){
		print_result();
	}
	private void print_result() {
		System.out.print("신장(cm단위)을 입력하세요");
		height = s.nextInt();
		System.out.print("체중(kg단위)을 입력하세요");
		weight = s.nextInt();
		
		bmi = weight/((height/100)*(height/100));
		
		if(bmi>=25) {
			System.out.println("당신은 비만 입니다.");
		}else {
			System.out.println("당신은 비만이 아니군요.");
		}
	}
}
