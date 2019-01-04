package wa_lab.stepK;

import java.util.*;

public class Student {
	Scanner s = new Scanner(System.in);
	int score[][] = new int[5][3];
	int total[]=new int[5];
	double average[]=new double[5];
	String grade[]=new String[5];
	int n=0;
	
	public void input() {
		System.out.print("학생의 국어, 영어, 수학점수를 입력하시오 -->");
		for(int i=0;i<3;i++) {
			score[n][i]=s.nextInt();
			total[n]+=score[n][i];
		}
		average[n]=total[n]/3.0;
		if(average[n]>=95) grade[n]="A+";
		else if(average[n]>=90&&average[n]<95) grade[n]="A";
		else if(average[n]>=85&&average[n]<90) grade[n]="B+";
		else if(average[n]>=80&&average[n]<85) grade[n]="B";
		else if(average[n]>=75&&average[n]<80) grade[n]="C+";
		else if(average[n]>=70&&average[n]<75) grade[n]="C";
		else if(average[n]>=65&&average[n]<70) grade[n]="D+";
		else if(average[n]>=60&&average[n]<65) grade[n]="D";
		else if(average[n]>=90&&average[n]<95) grade[n]="F";
		n++;
	}
	
	public void output(int index) {
		System.out.println("=================================");
		System.out.println("등록된 3명의 학생 목록은 다음과 같습니다.");
		System.out.println("=================================");
		System.out.println("번호\t국어\t영어\t수학\t총점\t평균\t학점\n");
		for(int a=0;a<index;a++) {
				System.out.printf("%d\t%d\t%d\t%d\t%d\t%.1f\t%s\n", a+1,score[a][0],score[a][1],score[a][2],total[a],average[a],grade[a]);
		}
	}
}
