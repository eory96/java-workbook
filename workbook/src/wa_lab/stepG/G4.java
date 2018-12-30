package wa_lab.stepG;

import java.util.*;

public class G4 {
	int kind;
	int money;
	int charge;
	int total_charge;
	Scanner s = new Scanner(System.in);
	
	G4(){
		input();
	}
	public void input() {
		while(true) {
			System.out.print("부동산 거래종류(1: 매매, 2:임대, 0:계산종료)를 입력하세요. ");
			kind = s.nextInt();
			if(kind==0) break;
			else if(kind==1) {
				sell();
			}else if(kind==2) {
				rent();
			}else {
				System.out.println("없는 선");
			}
		}
	}
	private void sell() {
		System.out.print("부동산 거래금액(원)을 입력하세요 : ");
		money = s.nextInt();
		if(money<50000000) {
			charge = (int) (money*0.006);
			if(charge>250000) {
				charge=250000;
			}
			total_charge+=charge;
			System.out.println("이에 대한 중개 수수료는 "+charge+"원입니다. ");
			
		}
		else if(money<200000000&&money>=50000000) {
			charge = (int) (money*0.005);
			if(charge>800000) {
				charge=800000;
			}
			total_charge+=charge;
			System.out.println("이에 대한 중개 수수료는 "+charge+"원입니다. ");
		}
		else {
			charge = money*4/1000;
			this.total_charge+=charge;
			System.out.println("이에 대한 중개 수수료는 "+charge+"원입니다. ");
		}
	}
	private void rent() {
		System.out.print("부동산 거래금액(원)을 입력하세요 : ");
		money = s.nextInt();
		if(money<20000000) {
			charge = (int) (money*0.005);
			if(charge>70000) {
				charge=70000;
			}
			total_charge+=charge;
			System.out.println("이에 대한 중개 수수료는 "+charge+"원입니다. ");
		}
		else if(money<50000000&&money>=20000000) {
			charge = (int) (money*0.005);
			if(charge>200000) {
				charge=200000;
			}
			total_charge+=charge;
			System.out.println("이에 대한 중개 수수료는 "+charge+"원입니다. ");
		}
		else if(money<100000000&&money>=50000000) {
			charge = (int) (money*0.004);
			if(charge>300000) {
				charge=300000;
			}
			total_charge+=charge;
			System.out.println("이에 대한 중개 수수료는 "+charge+"원입니다. ");
		}
		else {
			charge = (int) (money*0.003);
			total_charge+=charge;
			System.out.println("이에 대한 중개 수수료는 "+charge+"원입니다. ");
		}
	}
	public void print_result() {
		System.out.println("지금까지의 수수료 총액은 "+total_charge+"원입니다. ");
	}
}
