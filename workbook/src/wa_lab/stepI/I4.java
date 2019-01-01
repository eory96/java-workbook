package wa_lab.stepI;

import java.util.*;

public class I4 {
	int i;
	int menu;
	int total;
	Scanner s = new Scanner(System.in);
	
	I4(){
		print_result();
	}
	public int SelectMenu() {
		System.out.print("1. 피자(15,000원) 2.스파게티(10,000원) 3. 샐러드(7,000원) 4. 음료수(2,000원)\n");
		System.out.print("메뉴를 선택해 주세요.(종료 : 5)");
		menu = s.nextInt();
		if(menu==1) {
			return 15000;
		}else if(menu==2) {
			return 10000;
		}else if(menu==3) {
			return 7000;
		}else if(menu==4) {
			return 2000;
		}else if(menu==5) {
			return -1;
		}else {
			return -1;
		}
		//return menu;
	}
	public void print_result() {
		int k;
		while(true) {
			k=SelectMenu();
			if(k!=-1) {
				total+=k;
			}else {
				break;
			}
			System.out.printf("현재까지의 주문 금액은 %d입니다.\n\n", total);
		}
		System.out.printf("총 주문 금액은 %d입니다.\n\n", total);
	}
}
