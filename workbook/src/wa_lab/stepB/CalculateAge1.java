package wa_lab.stepB;

import java.util.*;

public class CalculateAge1 {
	int year;
	int age;

	public CalculateAge1(){
		input();
	}
	
	public void printA1() {
		System.out.printf("당신의 나이는 %d살 입니다.", getAge());
		if(age<20)
			System.out.print("미성년자 입니다.");
		else
			System.out.print("미성년자가 아닙니다.");
	}	

	void input() {
		Scanner s = new Scanner(System.in);
		System.out.print("태어난 년도는?");
		year = s.nextInt();
	}	
	int getAge() {
		age = 2018 - year + 1;
		return age;
	}
}
