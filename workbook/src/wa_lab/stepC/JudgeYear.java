package wa_lab.stepC;

import java.util.*;

public class JudgeYear {
	int year;
	Scanner s = new Scanner(System.in);
	JudgeYear(){
		input();
	}
	public void input() {
		System.out.printf("년도를 입력하세요. ");
		year = s.nextInt();
	}
	private boolean judge() {
		if(year%4==0) {
			if(year%100==0) {
				if(year%400==0) {
					return true;
				}
				else {
					return false;
				}
			}
			else {
				return true;
			}
		}
		else {
			return false;
		}
	}
	public void result() {
		if(judge()==true) {
			System.out.println("입력하신 년도는 윤년입니다.");
		}else {
			System.out.println("입력하신 년도는 윤년이 아닙니다.");
		}
	}
}
