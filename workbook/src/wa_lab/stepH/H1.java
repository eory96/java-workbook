package wa_lab.stepH;

import java.util.*;

public class H1 {
	int answer;
	int number_try; 
	int count;
	Random r = new Random();
	Scanner s = new Scanner(System.in);
	H1(){
		input();
	}
	public void input() {
		answer = r.nextInt(100);
		while(true) {
			count++;
			System.out.printf("1부터 100까지의 숫자 하나를 맞춰보세요.");
			number_try = s.nextInt();
			if(number_try==answer)
				break;
			else if(number_try>answer)
				System.out.println("좀 더 작은 수입니다.");
			else 
				System.out.println("좀 더 큰 수입니다.");
		}
		System.out.printf("%d 번만에 숫자를 맞추셨습니다.", count);
	}
}
