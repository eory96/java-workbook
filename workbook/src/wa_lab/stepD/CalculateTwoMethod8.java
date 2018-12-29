package wa_lab.stepD;

import java.util.*;

public class CalculateTwoMethod8 {
	int a,b,c;
	int x_begin, x_end;
	int x,y;
	Scanner s = new Scanner(System.in);
	
	CalculateTwoMethod8(){
		input();
	}
	public void input() {
		System.out.print("2차 함수 y=ax^2+bx+c의 계수 a와 b,c를 입력 하시오.");
		a = s.nextInt();
		b = s.nextInt();
		c = s.nextInt();
		System.out.print("x좌표의 시작 값과 끝 값을 입력하시오.");
		x_begin = s.nextInt();
		x_end=s.nextInt();
	}
	public void print_result() {
		for(int i=x_begin;i<=x_end;i++) {
			y=a*i*i+b*i+c;
			System.out.printf("좌표 (%d, %d)\n", i,y);
		}
	}
}
