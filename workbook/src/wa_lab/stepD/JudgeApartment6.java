package wa_lab.stepD;

import java.util.*;

public class JudgeApartment6 {
	double m2_area; 
	double pyung_area;
	int count1;
	int count2;
	int count3; 
	int count4;
	int i;
	Scanner s = new Scanner(System.in);
	
	JudgeApartment6(){
		input();
	}
	public void input() {
		for(i=0;i<10;i++) {
			System.out.print("아파트의 분양 면적(제곱미터)을 입력하시오.");
			m2_area = s.nextDouble();
			pyung_area = m2_area/3.305;
			System.out.printf("--> 이 아파트의 평형은 %.1f 입니다.\n", pyung_area);
			judge(pyung_area);
		}
	}
	private void judge(double pa){
		if(pa<15) count1++;
		else if(pa>=15&&pa<30) count2++;
		else if(pa>=30&&pa<50) count3++;
		else count4++;
	}
	public void print_result() {
		System.out.printf("\"소형 아파트\"의 개수는 %d 입니다.\n", count1);
		System.out.printf("\"중소형 아파트\"의 개수는 %d 입니다.\n", count2);
		System.out.printf("\"중형 아파트\"의 개수는 %d 입니다.\n", count3);
		System.out.printf("\"대형 아파트\"의 개수는 %d 입니다.\n", count4);
	}
}
