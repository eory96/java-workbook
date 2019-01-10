package wa_lab.stepG;

import java.util.*;

public class G3 {
	int jumsu[][]=new int[5][3];
	double sub_average[] = new double[3];
	double stu_average[] = new double[5];
	String class_name[]={"국어","영어","수학"}; 
	int subjectTotal[] = new int[3];
	int studentTotal[] = new int[5];
	//int kor, eng, mat;
	//int sum, average, grade;
	int i,j; 
	Scanner s= new Scanner(System.in);
	
	G3(){
		input();
	}
	public void input() {
		for(i=0;i<5;i++) {
			System.out.printf("%d번 학생의 국어, 영어, 수학 점수는?", i+1);
			for(j=0;j<3;j++){
				jumsu[i][j]=s.nextInt();
			}
		}
		System.out.printf("\n");
	}
	private void calculate1() {
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 5; j++)
				subjectTotal[i] += jumsu[j][i];
		}
		for(int i = 0; i < 3; i++)
			sub_average[i] = subjectTotal[i] / 5.0;
	}
	
	private void calculate3() {
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 3; j++)
				studentTotal[i] += jumsu[i][j];
		}
		for(int i = 0; i < 5; i++)
			stu_average[i] = studentTotal[i] / 5.0;
	}
	
	private String judge(int i) {
		if(stu_average[i]>=90) {
			return "A";
		}else if(stu_average[i]>=80&&stu_average[i]<90) {
			return "B";
		}else if(stu_average[i]>=70&&stu_average[i]<80) {
			return "C";
		}else if(stu_average[i]>=60&&stu_average[i]<70) {
			return "D";
		}else {
			return "F";
		}
	}
	
	public void print_result() {
		calculate1();
		calculate3();
		System.out.println("\n1) 각 과목별 총점과 평균 점수");
		for(int k=0;k<3;k++) {
			System.out.printf("%s 과목 총점은 %d 평균은 %.1f입니다.\n",class_name[k],subjectTotal[k],sub_average[k]);
		}
		
		System.out.println("\n2) 각 학생별 총점과 평균 점수");
		for(i=0;i<5;i++) {
			System.out.printf("%d번 학생 점수 : 총점 %d, 평균 %.1f, 등급 %s\n",i+1,studentTotal[i],stu_average[i],judge(i));
		}
	}
}
