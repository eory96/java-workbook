package wa_lab.stepL;

import java.text.ParseException;
import java.util.*;

public class StepLManager {
	private int menu;
	Scanner s = new Scanner(System.in);
	public StepLManager() throws ParseException {
		while(true) {
			printf("---------------------------\n");
			printf("1. 메뉴판 저장하기 \n");
			printf("2. 주차장 입출력 관리\n");
			printf("3. 식당 주문 관리\n");
			printf("4. 학생 정보 관리\n");
			printf("=>원하는 메뉴는? (0 : exit) : ");
			menu = s.nextInt();
			if(menu==0) break;
			switch(menu) {
				case 1:
					Menu m= new Menu();
					break;
				case 2:
					Parking p = new Parking();
					break;
				case 3:
					Restaurant rr = new Restaurant();
					break;
				case 4:
					Information sif = new Information();
					break;
			}
		}
	}
	private void printf(String s) {
		System.out.print(s);
	}
	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		StepLManager l = new StepLManager();
	}

}
