package wa_lab.stepA;

import java.util.*;

public class CalculateDay {
	int days;
	int seconds;

	public CalculateDay() {input();}
	public void printA5() {
		System.out.println("날 수에 해당하는 시간은 모두,"+output()+"초 입니다.\n");
	}
	void input() {
		Scanner s = new Scanner(System.in);
		System.out.print("날 수를 입력하세요.\n");
		days = s.nextInt();
	}

	int output() {
		this.seconds = this.days*24*60*60;
		return seconds;
	}
}
