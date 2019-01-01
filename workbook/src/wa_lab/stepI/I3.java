package wa_lab.stepI;

import java.util.*;

public class I3 {
	int height;
	int weight;
	int i;
	Scanner s = new Scanner(System.in);
	
	I3(){
		input();
	}
	void input() {
		for(i=0;i<10;i++) {
			System.out.printf("%d번째 사람의 신장과 체중을 입력하시오.", i+1);
			height = s.nextInt();
			weight = s.nextInt();
			AskBiman(height,weight);
		}
	}
	private void AskBiman(int h,int w) {
		double cal = w/((h*0.01)*(h*0.01));
		
		if(cal<18.5) {
			System.out.println("저체중 입니다.");
		}else if(cal>=18.5&&cal<23) {
			System.out.println("정상체중 입니다.");
		}else if(cal>=23&&cal<25) {
			System.out.println("과체중 입니다.");
		}else if(cal>=25&&cal<30) {
			System.out.println("경도비만 입니다.");
		}else{
			System.out.println("고도비만 입니다.");
		}
	}
}
