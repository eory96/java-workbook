package wa_lab.stepD;

import java.util.*;

public class CalculateMethod7 {
	int a,b;
	int x_begin,x_end;
	int x,y;
	Scanner s = new Scanner(System.in);
	
	CalculateMethod7(){
		input();
	}
	public void input() {
		System.out.print("1차 함수 y=ax+b의 계수 a와 b를 입력하시오.");
		a=s.nextInt();
		b=s.nextInt();
		System.out.print("x좌표의 시작 값과 끝 값을 입력하시오.");
		x_begin = s.nextInt();
		x_end=s.nextInt();
	}
	public void print_result() {
		for(int i=x_begin;i<=x_end;i++) {
			y=a*i+b;
			System.out.printf("좌표 (%d, %d)\n", i,y);
		}
	}
}
