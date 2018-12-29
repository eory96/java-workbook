package wa_lab.stepD;

import java.util.*;

public class AddOneToNum1 {
	int number;
	int totalsum;
	int i;
	Scanner s = new Scanner(System.in);
	
	AddOneToNum1(){
		input();
	}
	public void input() {
		System.out.print("숫자를 입력 하세요");
		number = s.nextInt();
	}
	public int calculate() {
		for(i=1;i<=number;i++) {
			totalsum+=i;
		}
		return totalsum;
	}
	public void print_result() {
		System.out.printf("1부터 입력한 숫자까지의 모든 정수를 더한 값은 %d 입니다.", calculate());
	}
}
