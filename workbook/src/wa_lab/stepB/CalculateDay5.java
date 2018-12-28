package wa_lab.stepB;

import java.util.*;

public class CalculateDay5 {
	int days;
	int seconds;
	int m_count;
	Scanner s = new Scanner(System.in);
	
	CalculateDay5(){
		print_result();
	}
	
	private void print_result() {
		System.out.print("날수를 입력 하세요 ");
		days = s.nextInt();
		seconds = days*24*60*60;
		m_count = seconds/1000000;
		if(m_count>0) {
			System.out.println("날수에 해당되는 기간은 모두 "+seconds+"초 입니다.");
			System.out.println("100만초가 모두 "+m_count+"가 포함 됩니다.");
		}else {
			System.out.println("날수에 해당되는 기간은 모두 "+seconds+"초 입니다.");
		}
	}
}
