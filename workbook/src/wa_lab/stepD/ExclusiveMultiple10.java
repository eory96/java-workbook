package wa_lab.stepD;

import java.util.*;

public class ExclusiveMultiple10 {
	int num1, num2;
	int i;
	Scanner s = new Scanner(System.in);
	ExclusiveMultiple10(){
		input();
	}
	public void input() {
		System.out.printf("2개의 숫자를 입력하시오. ");
		num1 = s.nextInt();
		num2 = s.nextInt();
	}
	
	public void print_result() {
		for(i=1;i<=100;i++) {
			if((i%num1==0&&i%num2!=0)||(i%num2==0&&i%num1!=0)) {
				System.out.printf("%d, ",i);
			}
		}
	}
}
