package wa_lab.stepG;

import java.util.*;

public class G6 {
	int order[] = {0,0,0};
	int sale;
	int total_sale;
	int total_order[] = {0,0,0};
	int price[] = {10000, 6000, 3000};
	int i;
	Scanner s = new Scanner(System.in);
	
	G6(){
		input();
	}
	public void input() {
		System.out.print("세 종류의 제품이 있습니다.\n(1.가죽장갑 1만원, 2. 털장갑 6천원, 3. 비닐장갑 3천원)\n");
		while(true) {
			System.out.print("\n");
			for(i=0;i<3;i++) {
				System.out.printf("%d번 제품은 몇개를 구입하실래요?",i+1);
				order[i]=s.nextInt();
			}
			if(order[0]==0&&order[1]==0&&order[2]==0) {
				System.out.printf("지금까지의 총 판매금액은 %d입니다.",total_sale);
				break;
			}
			cal();
		}
	}
	private void cal() {
		sale=0;
		for(i=0;i<3;i++) {
			sale+=order[i]*price[i];
		}
		System.out.printf("판매금액은 %d입니다.\n",sale);
		total_sale+=sale;
	}
}
