package wa_lab.stepF;

import java.util.*;

public class F9 {
	int monthdays[] = {31,28,31,30,31,30,31,31,30,31,30,31};
	int month, day; 
	int day_count; 
	int i;
	Scanner s = new Scanner(System.in);
	F9(){
		input();
	}
	public void input() {
		System.out.print("월을 입력하시오.");
		month = s.nextInt();
		System.out.print("일을 입력하시오.");
		day= s.nextInt();
		
	}
	private int calculate() {
		for(int i = 0; i<month-1; i++) {
			day_count += this.monthdays[i];
		}
		day_count += day;
			
		return day_count;
	}
	
	public void print_result() {
		if(month>12) {
			System.out.printf("잘못 입력하셨습니다1.\n");
			return;
		}
		if(monthdays[month-1]<day) {
			System.out.printf("잘못 입력하셨습니다2.\n");
			return;
		}
		System.out.printf("이 날 짜는 1년 중 %d번째 날에 해당 됩니다.",calculate());
	}
	
}
