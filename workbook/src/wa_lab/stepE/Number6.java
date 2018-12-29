package wa_lab.stepE;

import java.util.*;

public class Number6 {
	int rows,columns;
	int number;
	int i,j;
	Scanner s = new Scanner(System.in);
	Number6(){
		input();
	}
	public void input() {
		System.out.print("출력하려는 행의 크기와 열의 크기를 입력하시오.");
		rows = s.nextInt();
		columns = s.nextInt();
	}
	public void print_result() {
		for(i=1;i<=rows;i++) {
			for(j=1;j<=columns;j++) {
				System.out.printf("%5d",i*j);
				}
			System.out.printf("\n",number);
		}
	}
}
