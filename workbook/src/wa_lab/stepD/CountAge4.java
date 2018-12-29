package wa_lab.stepD;

import java.util.*;

public class CountAge4 {
	int count_all;
	int count_young=0;
	int birth_year;
	int age;
	int i;
	Scanner s = new Scanner(System.in);
	
	CountAge4(){
		input();
	}
	public void input() {
		System.out.print("가족이 몇명 인지 입력하세요");
		count_all = s.nextInt();
		for(i=0;i<count_all;i++) {
			System.out.print("태어난 년도를 입력하세요 ");
			birth_year = s.nextInt();
			age = 2018-birth_year+1;
			if(age<20)
				count_young++;
		}
		System.out.printf("가족들 중에 미성년자는 모두 %d명 입니다.",count_young);
	}
}
