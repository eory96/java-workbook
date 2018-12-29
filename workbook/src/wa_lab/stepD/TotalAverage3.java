package wa_lab.stepD;

import java.util.*;

public class TotalAverage3 {
	int number;
	int count=0;
	int totalsum;
	double average;
	Scanner s = new Scanner(System.in);
	
	TotalAverage3(){
		input();
	}
	public void input() {
		while(true) {
			System.out.print("0부터 100 사이의 숫자를 입력하세요.");
			number=s.nextInt();
			if(number>100) break;
			count++;
			totalsum+=number;
		}
		average = totalsum/count;
		
		System.out.printf("입력한 %d개의 숫자들의 숫자들의 총합계는 %d이고, 평균 값은 %.1f 입니다.",count,totalsum,average);
	}
}
