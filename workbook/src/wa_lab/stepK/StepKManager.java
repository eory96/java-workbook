package wa_lab.stepK;

import java.util.*;

public class StepKManager {
	public StepKManager() {
		int menu;
		Scanner s = new Scanner(System.in);
		while(true) {
			printf("---------------------\n");
			printf("1. 메뉴판 저장하기\n");
			printf("2. 메뉴판 저장하기\n");
			printf("3. 좌표 저장하기\n");
			printf("4. 좌표 저장하기\n");
			printf("5. 사용자 목록 저장하기\n");
			printf("6. 사용자 목록 저장하기\n");
			printf("7. 학생 점수 결과 저장하기\n");
			printf("=>원하는 메뉴는?(0:exit) :");
			menu = s.nextInt();
			if(menu == 0) break;
			switch(menu) {
			case 1:
				
				K1 k1 = new K1();
				k1.main();
				break;
			case 2:
				
				K2 k2 = new K2();
				k2.main();
				break;
			case 3:
				
				K3 k3 = new K3();
				k3.main();
				break;
			case 4:
				K4 k4 = new K4();
				k4.main();
				break;
			case 5 :	
				K5 k5 = new K5();
				k5.main();
				break;
			case 6 : 
				K6 k6 = new K6();
				k6.main();
				break;
			 case 7 : 
				K7 k7 = new K7();
				k7.main();
				break;
			}
		}
		
	}
	void printf(String s){
		System.out.print(s);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StepKManager j = new StepKManager();
	}
}
