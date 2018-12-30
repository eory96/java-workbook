package wa_lab.stepF;

import java.util.Scanner;

public class F4 {
	int jumsu[][] = new int[5][3];
	int sum[] = new int[5];
	double average[] = new double[5]; 
	int kor, eng, mat;
	int i, j;
	Scanner s = new Scanner(System.in);
	
	F4(){
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
				sum[i] += jumsu[i][j];
		}
		
		for(int i = 0; i < 5; i++)
			average[i] = (double)sum[i] / 3.0;
		
		System.out.printf("1번학생의 총점은 %d이고, 평균은 %.1f입니다.\n",sum[0],average[0]);
		System.out.printf("2번학생의 총점은 %d이고, 평균은 %.1f입니다.\n",sum[1],average[1]);
		System.out.printf("3번학생의 총점은 %d이고, 평균은 %.1f입니다.\n",sum[2],average[2]);
		System.out.printf("4번학생의 총점은 %d이고, 평균은 %.1f입니다.\n",sum[3],average[3]);
		System.out.printf("5번학생의 총점은 %d이고, 평균은 %.1f입니다.\n",sum[4],average[4]);
	}
	
}
