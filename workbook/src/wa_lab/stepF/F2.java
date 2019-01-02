package wa_lab.stepF;

import java.util.*;

public class F2 {
	double score[] = new double[10]; // 심사점수 리스트
	double maxscore, minscore; 
	double total;
	double average;
	int i;
	Scanner s = new Scanner(System.in);
	
	F2(){
		input();
	}
	public void input() {
		for(i=0;i<10;i++) {
			System.out.printf("%d번 심사점수를 입력하시오.",i+1);
			score[i] = s.nextDouble();
		}
	}
	public void print_result() {
		maxscore=score[0];
		minscore=score[0];
		
		
		for(i=0;i<10;i++) {
			if(maxscore<score[i]) {
				maxscore=score[i];
			}
			if(minscore>score[i]) {
				minscore=score[i];
			}
		}
		
		for(i=0;i<10;i++) {
			total+=score[i];
		}
		total=(int) (total-maxscore-minscore);
		average = total/8;
		System.out.printf("가장 큰 점수와 가장 작은 점수를 제외한 8개의 점수에 대한 평균은 %.1f입니다.", average,maxscore,minscore,total);
	}
}
