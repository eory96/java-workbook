package wa_lab.stepL;

import java.util.*;

public class Menu {
	Scanner s = new Scanner(System.in);
	Menu(){
		input();
	}
	public void input() {
		int num;
		MenuManage m =new MenuManage();
		while(true) {
			System.out.print("1)추가 2)수정 3)삭제 4)리스트 5)총개수 6)종료 ==> ");
			num=s.nextInt();
			System.out.println("---------------------------------------------------");
			if(num==6) {
				System.out.println("종료되었습니다.");
				break;
			}else if(num==1) m.adding();
			else if(num==2) m.modify();
			else if(num==3) m.delete();
			else if(num==4) m.list();
			else if(num==5) m.amount();
			else System.out.println("잘못 입력 하였습니다.");
		}
	}
}
