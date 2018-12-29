package wa_lab.stepC;

import java.util.Scanner;

public class CalculateAge1 {
	int year;
	int age;

	public CalculateAge1(){
		input();
	}
	
	public void printA1() {
		if(age<7)
			System.out.println("유아 입니다.");
		else if(age>=7&&age<13)
			System.out.print("어린이 입니다.");
		else if(age>=13&&age<20)
			System.out.print("청소년 입니다.");
		else if(age>=20&&age<30)
			System.out.print("청년 입니다.");
		else if(age>=30&&age<60)
			System.out.print("중년 입니다.");
		else
			System.out.print("노년 입니다.");
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
