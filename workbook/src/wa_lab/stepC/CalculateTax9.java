package wa_lab.stepC;

import java.util.*;

public class CalculateTax9 {
	int income;
	int tax;
	Scanner s = new Scanner(System.in);
	
	CalculateTax9(){
		input();
	}
	public void input() {
		System.out.print("연봉(원 단위)을 숫자로 입력하세요.");
		income = s.nextInt();
	}
	private int cal_tax() {
		if(income<10000000) {
			tax = (int) (income*0.095);
			return tax;
		}else if(income>=10000000&&income<40000000) {
			tax = (int) (income*0.19);
			return tax;
		}else if(income>=40000000&&income<80000000) {
			tax = (int) (income*0.28);
			return tax;
		}else{
			tax = (int) (income*0.37);
			return tax;
		}
	}
	public void result() {
		System.out.println("연봉 금액에 대한 소득세는 "+cal_tax()+"원 입니다.");
	}
	
}
