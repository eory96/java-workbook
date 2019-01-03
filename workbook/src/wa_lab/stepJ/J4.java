package wa_lab.stepJ;

import java.util.*;

public class J4 {
	int monthdays[] = {31,28,31,30,31,30,31,31,30,31,30,31};
	int month1, day1; 
	int month2, day2;
	int day_count=0; 
	int i;
	Scanner s = new Scanner(System.in);
	J4(){
		input();
	}
	public void input() {
		System.out.print("첫번째 날짜를 입력하시오.");
		month1 = s.nextInt();
		day1 = s.nextInt();
		
		System.out.print("두번째 날짜를 입력하시오.");
		month2 = s.nextInt();
		day2 = s.nextInt();
		
	}
	
	private int calcDate(int m,int d) {
		day_count=0;
		for(int j = 0; j<m-1; j++) {
			day_count += monthdays[j];
		}
		day_count += d;
			
		return day_count;
	}
	
	public void print_result() {
		if(month1>12||month2>12) {
			System.out.printf("잘못 입력하셨습니다1.\n");
			return;
		}
		if(monthdays[month1-1]<day1||monthdays[month2-1]<day2) {
			System.out.printf("잘못 입력하셨습니다.\n");
			return;
		}
		
		int first = calcDate(month1,day1);
		int second = calcDate(month2,day2);
		System.out.println(first);
		System.out.println(second);
		
		int cal;
		if(first>second) 
			cal = first-second;
		else if(second>first)
			cal = second-first;
		else 
			cal =0;
		System.out.printf("두 날짜의 간격은 %d일 입니다.",cal);
	}
}
