package wa_lab.stepL;

import java.text.ParseException;
import java.util.*;

public class Parking {
	
	Scanner s = new Scanner(System.in);
	
	Parking() throws ParseException{
		input();
	}
	
	public void input() throws ParseException {
		int num;
		int space;
		
		ParkingManage m =new ParkingManage();
		
		while(true) {
			System.out.print("1)추가 2)출차 3)리스트 4)입차 총개수 5)주차잔여개수 6)종료 ==> ");
			num=s.nextInt();
			System.out.println("---------------------------------------------------");
			if(num==6) {
				System.out.println("종료되었습니다.");
				break;
			}else if(num==1) m.adding();
			else if(num==2) m.out();
			else if(num==3) m.list();
			else if(num==4) m.in_car();
			else if(num==5) m.remain();
			else System.out.println("잘못 입력 하였습니다.");
		}
	}
}
