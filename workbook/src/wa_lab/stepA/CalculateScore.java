package wa_lab.stepA;

import java.util.*;

public class CalculateScore {
	private int kor;
	private int eng;
	private int math;
	private int total;
	private double ave;


	public CalculateScore() {input();}
	public void printA6() {
		System.out.print("입력하신 점수의 총점은"+output()+"이고,\n");
		System.out.print("평균은,"+output_ave()+"입니다.\n");
	}
	void input() {
		Scanner s = new Scanner(System.in);
		System.out.print("국어점수를 입력하세요.");
		kor = s.nextInt();
		System.out.print("영어점수를 입력하세요.");
		eng = s.nextInt();
		System.out.print("수학점수를 입력하세요.");
		math = s.nextInt();
	}

	int output() {
		total = kor+ eng+ math;
		return total;
	}

	double output_ave() {
		ave = total/3.0;
		return ave;
	}
}
