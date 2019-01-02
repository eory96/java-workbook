package wa_lab.stepF;

import java.util.*;

public class F3 {
	int jumsu[][] = new int[5][3];
	int sum[] = new int[3];
	double average[] = new double[3]; 
	String str[] = {"국어", "영어","수학"};
	int i, j;
	Scanner s = new Scanner(System.in);
	
	F3(){
		input();
	}
	public void input() {
		for(int i=0; i<5; i++) {
			System.out.printf("%d번 학생 국어, 영어 수학 점수를 입력하시오. ",i+1);
			for(int j=0; j<3; j++) {
				
				jumsu[i][j]= s.nextInt();
			}
		}
	}
	public void print_result() {
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 3; j++)
				sum[j] += jumsu[i][j];
		}
		
		for(int i = 0; i < 3; i++)
			average[i] = (double)sum[i] / 5.0;
		
		for(i=0;i<3;i++) {
			System.out.printf("%s의 총점은 %d이고, 평균은 %.1f입니다.\n",str[i],sum[i],average[i]);
		}
		//System.out.printf("국어의 총점은 %d이고, 평균은 %.1f입니다.\n",sum[0],average[0]);
		//System.out.printf("영어의 총점은 %d이고, 평균은 %.1f입니다.\n",sum[1],average[1]);
		//System.out.printf("수학의 총점은 %d이고, 평균은 %.1f입니다.\n",sum[2],average[2]);
	}
	
}
