package wa_lab.stepC;

import java.util.Scanner;

public class CalculateScore6 {
	int kor, eng, math; 
	int total;
	double average;
	Scanner s = new Scanner(System.in);
	
	CalculateScore6(){
		print_result();
	}
	
	private void print_result() {
		Scanner s = new Scanner(System.in);
		System.out.print("국어점수를 입력하세요.");
		kor = s.nextInt();
		System.out.print("영어점수를 입력하세요.");
		eng = s.nextInt();
		System.out.print("수학점수를 입력하세요.");
		math = s.nextInt();
		total = kor+eng+math;
		average = total/3.0;
		
		System.out.printf("입력하신 점수의 총점은 %d 이고,\n", total);
		System.out.printf("평균은 %.1f점 입니다.\n", average);
		if(average>=90)
			System.out.println("수 입니다.");
		else if(average>=80&&average<90)
			System.out.println("우 입니다.");
		else if(average>=70&&average<80)
			System.out.println("미 입니다.");
		else if(average>=60&&average<70)
			System.out.println("양 입니다.");
		else
			System.out.println("가 입니다.");
	}
}
