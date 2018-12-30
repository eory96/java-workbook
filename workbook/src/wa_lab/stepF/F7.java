package wa_lab.stepF;

import java.util.*;

public class F7 {
	int number[][] = new int[5][3]; 
	int newnum;
	int floor_total[] = new int[5]; 
	int line_total[] = new int[3];
	int total;
	int ho;
	int i, j;
	Scanner s = new Scanner(System.in);
	
	F7(){
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
	private void cal_floor() {
		for(i=0;i<5;i++) {
			for(j=0;j<3;j++) {
				this.floor_total[i]+=number[i][j];
			}
		}
	}
	private void cal_line() {
		for(i=0;i<3;i++) {
			for(j=0;j<5;j++) {
				this.line_total[i]+=number[j][i];
			}
		}
	}
	private void cal_total() {
		for(i=0;i<5;i++) {
			for(j=0;j<3;j++) {
				this.total+=number[i][j];
			}
		}
	}
	public void print_result() {
		cal_floor();
		cal_line();
		cal_total();
		for(i=0;i<5;i++) {
			System.out.printf("%d층에 사는 거주자는 모두 %d명 입니다.\n",i+1,floor_total[i]);
		}
		for(i=0;i<3;i++) {
			System.out.printf("%d호 라인에 사는 거주자는 모두 %d명 입니다.\n",i+1,line_total[i]);
		}
		System.out.printf("이 아파트에 사는 거주자는 모두 %d명 입니다.", total);
	}
	
}