package wa_lab.stepJ;

import java.util.*;

public class J7 {
	Scanner s = new Scanner(System.in);
	int power;
	
	public J7() {
		input();
	}
	
	void input() {
		while(true) {
			System.out.print("숫자를 입력하시오. (0.종료) : ");
			power = s.nextInt();
			if(power == 0)
				break;
			System.out.printf("2의 %d 승은 : %d",power,PowerOfTwo(power));
		}
	}
	
	int PowerOfTwo(int n) {
		if(n ==0)
			return 1;
		else
			return 2* PowerOfTwo(n-1);
	}
}
