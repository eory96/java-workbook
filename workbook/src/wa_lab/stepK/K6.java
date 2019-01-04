package wa_lab.stepK;

import java.util.*;

public class K6 {
	public void main() {
		UserInfo u = new UserInfo();
		Scanner s = new Scanner(System.in);
		int num;
		System.out.print("등록할 학생의 명수는?");
		num=s.nextInt();
		
		for(int i=0;i<num;i++) {
			System.out.printf("%d번 ",i+1);
			u.input();
		}
		u.print(num);
	}
}
