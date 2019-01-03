package wa_lab.stepJ;

import java.util.*;

public class J2 {
	double score[]=new double[10];
	int i;
	Scanner s = new Scanner(System.in);
	
	J2() {
		input();
	}
	public void input() {
		for(i=0;i<10;i++) {
			System.out.printf("%d번 심사점수를 입력하시오.", i+1);
			score[i] = s.nextDouble();
		}
	}
	
	private double max(double s[]) {
		double max=0;
		for(i=0;i<10;i++) {
			if(max<s[i])
				max=s[i];
		}
		return max;
	}
	private double min(double s[]) {
		double min=1000000;
		for(i=0;i<10;i++) {
			if(min>s[i])
				min=s[i];
		}
		return min;
	}
	
	public void print_result() {
		double m=max(score);
		double s=min(score);
		double total =0;
		for(i=0;i<10;i++) {
				total+=score[i];
		}
		total=total-s-m;
		System.out.printf("가장 큰 점수와 가장 작은 점수를 제외한 8개의 점수에 대한 평균은 %.1f입니다.", total/8);
	}
}
