package wa_lab.stepK;

import java.util.*;

public class UserInfo {
	String id[]=new String[100];
	String pass[] = new String[100];
	int i=0;
	Scanner s = new Scanner(System.in);
	
	public void input() {
		System.out.print("학생의 아이디, 비밀번호를 입력하시오 --> ");
		id[i]=s.next();
		pass[i]=s.next();
		i++;
	}
	
	public void print(int index) {
		System.out.println("===================================");
		System.out.println("등록된 학생 목록은 다음과 같습니다.");
		System.out.println("===================================");
		System.out.println("번호\t아이디\t비밀번호");
		for(i=0;i<index;i++) {
			System.out.printf("%d\t%s\t%s\n", i+1,id[i],pass[i]);
		}
	}
}
