package wa_lab.stepJ;

import java.util.*;

public class J5 {
	Scanner s = new Scanner(System.in);
	int total;
	String c;
	
	J5(){
		input();
	}
	
	public void input() {
		int start_h, end_h;
		int start_m, end_m;
		int i=0;
		while(true) {
			System.out.printf("%d번 차량 주차 시작 시각 (시 분) : ", i+1);
			start_h = s.nextInt();
			start_m = s.nextInt();
			System.out.printf("%d번 차량 주차 종료 시각 (시 분) : ", i+1);
			end_h = s.nextInt();
			end_m = s.nextInt();
			total+=calcParking(start_h, start_m, end_h,end_m);
			i++;
			System.out.print("더 입력 하시겠습니까?(Y/N)");
			c=s.next();

			if(c.equals("N"))
				break;
		}
		System.out.printf("주차차량 %d대의 총 주차 요금은 %d입니다.",i,total );
	}
	
	private int calcParking(int s1,int s2,int e1,int e2 ) {
		int f_min,e_min;
		f_min = s1*60+s2;
		e_min = e1*60+e2;
		
		int cal = e_min-f_min;
		if(cal%10>0)
			cal=cal/10+1;
		else 
			cal = cal/10;
		System.out.printf("주차요금 : %d\n", cal*500);
		return cal*500;
	}
}
