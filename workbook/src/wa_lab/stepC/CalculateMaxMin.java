package wa_lab.stepC;

import java.util.*;

public class CalculateMaxMin {
	int num1, num2, num3; 
	int max_num, min_num;
	Scanner s = new Scanner(System.in);
	
	CalculateMaxMin(){
		input();
	}
	public void input() {
		System.out.printf("첫 번째 숫자를 입력하세요. ");
		num1 = s.nextInt();
		System.out.printf("두 번째 숫자를 입력하세요. ");
		num2 = s.nextInt();
		System.out.printf("세 번째 숫자를 입력하세요. ");
		num3 = s.nextInt();
	}
	private int cal_max() {
		if(num1>num2) {
			if(num1>num3) {
				max_num = num1;
			}
			else {
				max_num = num3;
			}
		}
		else {
			if(num2>num3) {
				max_num = num2;
			}
			else {
				max_num = num3;
			}
		}
		return max_num;
	}
	private int cal_min() {
		if(num1>num2) {
			if(num2>num3) {
				min_num = num3;
			}
			else {
				min_num = num2;
			}
		}
		else {
			if(num1>num3) {
				min_num = num3;
			}
			else {
				min_num = num1;
			}
		}
		return min_num;
	}
	public void result() {
		System.out.printf("가장 큰 수는" +cal_max()+ "이고, 가장 작은 수는 "+cal_min()+" 입니다.");
	}
}
