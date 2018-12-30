package wa_lab.stepF;

import java.util.*;

public class F1 {
	int[] num = new int[10];
	int first;
	int second;
	int second_max_index; 
	int newnum;
	int i;
	Scanner s = new Scanner(System.in);
	F1(){
		input();
	}
	public void input() {
		for(i=0;i<10;i++) {
			System.out.printf("%d번째 숫자를 입력하세요.",i+1);
			num[i]=s.nextInt();
		}
	}
	public void print_result() {
		first=num[0];
		second=num[0];
		
		second_max_index = 0;
		
		for(i=0;i<10;i++) {
			if(first<num[i]) {
				second=first;
				first=num[i];
			}
				
		}
		for(i=0;i<10;i++) {
			if(second==num[i]) {
				System.out.printf("두번째로 가장 큰수는 %d번째 %d 입니다.",i+1,second);
				break;
			}
		}
	}
}
