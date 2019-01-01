package wa_lab.stepI;

import java.util.*;

public class I5 {
	Scanner s = new Scanner(System.in);
	int i;
	int max;
	int list[] = new int[10];
	I5(){
		input();
	}
	
	void input() {
		System.out.printf("10개의 숫자중 최댓값을 구합니다.\n");
		for(i=0;i<10;i++) {
			System.out.printf("%d번 수를 입력하시오.", i+1);
			list[i]=s.nextInt();
		}
	}
	
	int MaxOfTen() {
		max=0;
		for(int k=0;k<10;k++) {
			if(max<list[k])
				max = list[k];
		}
		return max;
	}
	public void print_result() {
		System.out.printf("최댓값은 %d입니다", MaxOfTen());
	}
}
