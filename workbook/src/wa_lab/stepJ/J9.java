package wa_lab.stepJ;

import java.util.*;

public class J9 {
	Scanner s = new Scanner(System.in);
	
	J9(){
		input();
	}
	
	public void input() {
		int a,b;
		System.out.print("숫자2개를 입력하시오.");
		a = s.nextInt();
		b = s.nextInt();
		System.out.printf("%d의 %d승은 %d입니다.", a,b,power(a,b));
	}
	private int power(int num1, int num2) {
		if(num2==0)
			return 1;
		else if(num2==1)
			return num1;
		else if(num2%2==0) {
			return power(num1,num2/2)*power(num1,num2/2);
		}else
			return power(num1,num2/2)*power(num1,num2/2)*num1;
	}
}
