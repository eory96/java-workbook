package wa_lab.stepK;

import java.util.*;

public class K7 {
	public void main() {
		Scanner s = new Scanner(System.in);
		Student std = new Student();
		int num;
		while(true) {
			System.out.print("등록할 학생의 명수는? ");
			num = s.nextInt();
			if(num<6&&num>0)
				break;
			else if(num>5)
				System.out.println("너무 많은 학생수 입니다.");
			else 
				System.out.println("적어도 한명은 등록하여야 합니다.");
		}
		
		for(int k=0;k<num;k++) {
			System.out.printf("%d번 ",k+1);
			std.input();
		}
		std.output(num);
	}
}
