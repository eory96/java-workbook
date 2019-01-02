package wa_lab.stepF;

import java.util.*;

public class F6 {
	int number[][] = new int[5][3]; 
	int total;
	int i, j;
	Scanner s = new Scanner(System.in);
	
	F6(){
		input();
	}
	public void input() {
		for(i=0;i<5;i++) {
			for(j=0;j<3;j++) {
				System.out.printf("%d0%d호에 살고 있는 사람의 숫자를 입력하시오.", i+1,j+1);
				number[i][j]=s.nextInt();
			}
		}
	}
	public void print_result() {
		for(i=0;i<5;i++) {
			for(j=0;j<3;j++) {
				total+=number[i][j];
			}
		}
		System.out.printf("이 아파트에 사는 거주자는 모두 %d명 입니다.", total);
	}
	
}
