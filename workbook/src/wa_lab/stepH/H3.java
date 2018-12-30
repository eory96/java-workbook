package wa_lab.stepH;

import java.util.*;

public class H3 {
	int lotto_com[] = new int[6];
	int lotto_user[] = new int[6];
	int i;
	int count;
	int match_count;
	Scanner s = new Scanner(System.in);
	Random r = new Random();
	H3(){
		generate();
		input();
	}
	private void generate() {
		for(i=0;i<6;i++) {
			lotto_com[i] = r.nextInt(44)+1;
			for(int j=0;j<i;j++) {
				if(lotto_com[j]==lotto_com[i]) {
					while(true) {
						if(lotto_com[j]==lotto_com[i])
							lotto_com[i] = r.nextInt(45);
						else if(lotto_com[i-1]!=lotto_com[i])
							break;
					}
				}
			}
		}
	}
	
	public void input() {
		for(i=0;i<6;i++) {
			System.out.printf("원하는 %d번째 로또 숫자를 입력하세요.", i+1);
			lotto_user[i]=s.nextInt();
			
			if(judge(lotto_user[i],i)==true) {
				System.out.println("==>잘못 입력하셨습니다.");
				i--;
			}
		}
		
		System.out.printf("생성된 로또 번호는 ");
		for(i=0;i<6;i++) {
			System.out.printf("%d ", lotto_com[i]);
		}
		System.out.printf("입니다.\n ");
	}
	private boolean judge(int num,int k) {
		if(num>45) return true;
		if(num<1) return true;
		for(int j=0;j<k;j++) {
			if(num==lotto_user[j])
				return true;
		}
		
		return false;
	}
	public void print_result() {
		System.out.printf("생성된 로또 번호는 ");
		for(i=0;i<6;i++) {
			System.out.printf("%d ", lotto_user[i]);
		}
		System.out.printf("입니다.\n ");
		System.out.printf("일치하는 로또 번호 %d개 입니다.", judge2());
	}
	
	private int judge2() {
		count=0;
		for(i=0;i<6;i++) {
			for(int k=0;k<6;k++) {
				if(lotto_user[i]==lotto_com[k])
					count++;
			}
		}
		return count;
	}
}
