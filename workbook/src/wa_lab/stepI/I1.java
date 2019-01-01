package wa_lab.stepI;
import java.util.*;

public class I1 {
	int total;
	int menu;
	Scanner s = new Scanner(System.in);
	I1(){
		showMenu();
	}
	void showMenu() {
		System.out.print("1. 피자(15,000원) 2.스파게티(10,000원) 3. 샐러드(7,000원) 4. 음료수(2,000원)\n");
	}
	public void pick() {
		while(true) {
			System.out.print("메뉴를 선택해 주세요.(종료 : 5)");
			menu = s.nextInt();
			if(menu==1) {
				total+=15000;
			}else if(menu==2) {
				total+=10000;
			}else if(menu==3) {
				total+=7000;
			}else if(menu==4) {
				total+=2000;
			}else if(menu==5) {
				break;
			}else {
				System.out.println("잘못된 입력입니다.");
			}
			System.out.printf("현재까지의 주문 금액은 %d입니다.\n\n", total);
			showMenu();
		}
		System.out.printf("총 주문 금액은 %d입니다.\n\n", total);
	}
}
