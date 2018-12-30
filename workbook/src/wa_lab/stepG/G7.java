package wa_lab.stepG;

import java.util.*;

public class G7 {
	int team_count; // 방문한 팀수
	int charge[] = {5000, 10000, 15000, 3000};// 연령별 수
	int count[] = new int[4]; 
	int v_count[] = new int[4]; 
	int total_count = 0;
	int sum;
	int total_sum =0;
	int membership = 0;
	int i, j;
	Scanner s = new Scanner(System.in);
	G7(){
		input();
	}
	public void input() {
		System.out.print("오늘 방문한 팀 수를 입력하세요.");
		team_count=s.nextInt();
		for(i=0;i<team_count;i++) {
			System.out.printf("%d번팀 인원수(초등학생, 청소년, 일반, 경로대상)을 입력하세요",i+1);
			for(j=0;j<4;j++)
				count[j]=s.nextInt();
			System.out.printf("%d번팀 할인카드 종류(카드없음:0, 일반등급:1, VIP등급:2)를 입력하세요.", i+1);
			membership=s.nextInt();
			cal(i+1);
		}
	}
	
	private void cal(int i) {
		sum=0;
		for(j=0;j<4;j++) {
			sum+=count[j]*charge[j];
			v_count[j]+=count[j];
			total_count+=count[j];
		}
		if(membership==0) {
			sum=sum*1;
		}else if(membership==1) {
			sum=(int) (sum*0.9);
		}else if(membership==2) {
			sum=(int) (sum*0.8);
		}else {
			System.out.print("잘못된 멤버십 번호입니다.");
			return;
		}
		total_sum+=sum;
		System.out.printf("%d번팀 입장료는 %d입니다.\n",i, sum);
	}
	
	public void print_result() {
		System.out.printf("오늘 총 방문자 수는 %d명입니다.\n", total_count);
		System.out.printf("초등학생 수는 %d명입니다.\n", v_count[0]);
		System.out.printf("청소년 수는 %d명입니다.\n", v_count[1]);
		System.out.printf("일반인 수는 %d명입니다.\n", v_count[2]);
		System.out.printf("경로대상 수는 %d명입니다.\n\n", v_count[3]);
		System.out.printf("총 입장료는 %d입니다.\n", total_sum);
	}
}
