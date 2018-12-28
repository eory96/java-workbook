package wa_lab.stepA;

import java.util.*;

public class CalculateAge {
	private int year;
	private int age;

	public CalculateAge(){input();}
	public void printA1() {
		System.out.printf("당신의 나이는 %d살 입니다.\n", getAge());
	}	

	void input() {
		Scanner s = new Scanner(System.in);
		System.out.printf("태어난 년도는?");
		year = s.nextInt();
	}	
	int getAge() {
		age = 2018 - year + 1;
		return age;
	}
}
