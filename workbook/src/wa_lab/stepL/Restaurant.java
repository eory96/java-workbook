package wa_lab.stepL;

import java.text.ParseException;
import java.util.Scanner;

public class Restaurant {

	Scanner s = new Scanner(System.in);
	
	Restaurant() throws ParseException{
		input();
	}
	
	public void input() throws ParseException {
		int num;
		
		RestaurantManage r =new RestaurantManage();
		
		while(true) {
			System.out.println("---------------------------------------");
			System.out.print("1)주문 2)결제 3)리스트 4)종료 ==>");
			num = s.nextInt();
			System.out.println("---------------------------------------");
			if(num==4) {
				System.out.println("종료되었습니다.");
				break;
			}else if(num==1) r.order();
			else if(num==2) r.pay();
			else if(num==3) r.list();
			else System.out.println("잘못 입력 하였습니다.");
		}
	}
}
