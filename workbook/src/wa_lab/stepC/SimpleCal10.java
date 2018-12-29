package wa_lab.stepC;

import java.util.*;

public class SimpleCal10 {
	int num1, num2;
	String operator; 
	int result;
	Scanner s = new Scanner(System.in);
	
	SimpleCal10(){
		input();
	}
	public void input() {
		System.out.printf("숫자 1을 입력하세요. ");
		num1 = s.nextInt();
		System.out.printf("숫자 2를 입력하세요. ");
		num2 = s.nextInt();
		System.out.printf("연산 기호 문자('+', '-', '*', '/' 중 1개)를 입력하세요. ");
		operator = s.next();
	}
	private int calculate() {
		if(operator.equals("+")) {
			result = num1 + num2;
		}
		else if(operator.equals("-")) {
			result = num1 - num2;
		}
		else if(operator.equals("*")) {
			result = num1 * num2;
		}
		else if(operator.equals("/")) {
			result = num1 / num2;
		}
		return result;
	}
	public void print_result() {
		System.out.println("계산식의 결과 값은 "+calculate()+"입니다.");
	}
}
