package wa_lab.stepD;

import java.util.*;

public class Gugudan9 {
	int dan;
	int i;
	Scanner s = new Scanner(System.in);
	Gugudan9(){
		input();
	}
	public void input() {
		while(true) {
			System.out.print("출력하고 싶은 구구단의 단 수를 입력하시오(2~9).");
			dan = s.nextInt();
			if(dan==1||dan>9)
				System.out.println("잘못 입력하였습니다.");
			else 
				break;
		}
	}
	public void print_result() {
		for(i=1;i<10;i++) {
			System.out.printf("%d x %d = %d\n",dan,i,dan*i);
		}
	}
}
