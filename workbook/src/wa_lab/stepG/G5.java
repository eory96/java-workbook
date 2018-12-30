package wa_lab.stepG;

import java.util.*;

public class G5 {
	int hour, minute; 
	int charge;
	int total_charge;
	Scanner s = new Scanner(System.in);
	
	G5(){
		input();
	}
	public void input() {
		while(true) {
			System.out.print("사용한 시간을 시간과 분으로 입력하세요 : ");
			hour = s.nextInt();
			minute = s.nextInt();
			if(hour==0&&minute==0) {
				break;
			}
			calculate();
		}
		System.out.println("\n지금까지의 이용료 총 금액은 "+total_charge+"입니다.");
	}
	private void calculate() {
		int total_min = hour*60+minute;
		int count;
		if(total_min%30==0) {
			count=total_min/30;
		}else {
			count=total_min/30+1;
		}
		charge = count*1000;
		if(total_min>=0&&total_min<120) {
			charge = charge;
		}else if(total_min>=120&&total_min<180) {
			charge = (int) (charge*0.95);
		}else if(total_min>=180&&total_min<300) {
			charge = (int) (charge*0.90);
		}else{
			charge = (int) (charge*0.80);
		}
		System.out.printf("고객님의 이용료는 %d입니다.\n",charge);
		total_charge+=charge;
	}
}
