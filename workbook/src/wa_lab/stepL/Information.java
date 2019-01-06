package wa_lab.stepL;

import java.util.*;

public class Information {
	Scanner s = new Scanner(System.in);
	int num;
	Information(){
		input();
	}
	public void input() {
		InformationManage i = new InformationManage();
		while(true) {
			System.out.println("--------------------------------------------------------------------------------------------------");
			System.out.println("1)학생등록 2)정보수정 3)삭제 4)리스트 5) 이름검색 6)복학생리스트 7)주소검색 8)종료 ==>");
			num=s.nextInt();
			if(num==8) break;
			else if(num==1) i.register();
			else if(num==2) i.modify();
			else if(num==3) i.delete();
			else if(num==4) i.list();
			else if(num==5) i.search();
			else if(num==6) i.r_list();
			else if(num==7) i.n_search();
			else System.out.println("잘못된 선택 입니다.");;
		}
		
	}
	
}
