package wa_lab.stepD;

import java.util.*;

public class JudgeMaxMin2 {
	int number;
	int max_num,min_num;
	Scanner s = new Scanner(System.in);
	
	JudgeMaxMin2(){
		input();
	}
	public void input() {
		while(true) {
			System.out.print("0부터 100 사이의 숫자를 입력하세요.");
			number=s.nextInt();
			if(number>100) break;
			if(max_num<number) {
				max_num=number;
			}
			if(number<min_num) {
				min_num=number;
			}
		}
		System.out.printf("입력된 숫자들 중 가장 큰 수는 %d이고, 가장 작은 수는 %d입니다.", max_num,min_num);
	}
}
