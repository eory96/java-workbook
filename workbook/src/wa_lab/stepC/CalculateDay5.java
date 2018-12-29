package wa_lab.stepC;

import java.util.*;

public class CalculateDay5 {
	int month;
	int day;
	int day_count;
	Scanner s = new Scanner(System.in);
	
	CalculateDay5(){
		print_result();
	}
	public void print_result() {
		System.out.print("월을 입력하시오.");
		month = s.nextInt();
		System.out.print("월을 입력하시오.");
		day = s.nextInt();
	
		System.out.println("이 날짜는 1년 중 " + result()+" 번째 날에 해당됩니다.");
	}
	
	public int result() {
		if(month==1) {
			day_count = day;
		}
		else if(month == 2) {
			day_count = 31 + day;
		}
		else if(month == 3) {
			day_count = 31 + 28 + day;
		}
		else if(month == 4) {
			day_count = 31 + 28 + 31 + day;
		}
		else if(month == 5) {
			day_count = 31 + 28 + 31 + 30 + day;
		}
		else if(month == 6) {
			day_count = 31 + 28 + 31 + 30 + 31 + day;
		}
		else if(month == 7) {
			day_count = 31 + 28 + 31 + 30 + 31 + 30 + day;
		}
		else if(month == 8) {
			day_count = 31 + 28 + 31 + 30 + 31 + 30 + 31 + day;
		}
		else if(month == 9) {
			day_count = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + day;
		}
		else if(month == 10) {
			day_count = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + day;
		}
		else if(month == 11) {
			day_count = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + day;
		}
		else if(month == 12) {
			day_count = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + 30 + day;
		}
		else {
			day_count=-1;
		}
		return day_count;
	}
}
