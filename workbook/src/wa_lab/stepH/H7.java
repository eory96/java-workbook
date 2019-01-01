package wa_lab.stepH;

import java.util.*;

public class H7 {
	String input; // 입력받는 문자열
	int i;
	Scanner s = new Scanner(System.in);
	
	H7(){
		input();
	}
	
	public void input() {
		System.out.println("===========================================");
		System.out.print("=> 문자열을 입력하세요 (x: 종료) : ");
		input = s.nextLine();
	}
	
	public void print_result() {
		while(!input.equalsIgnoreCase("X")) {
			String list[] = input.split("");
			System.out.printf("=> 총 문자의 갯수는 %d입니다.\n", list.length);
			for(int i = 0;i< list.length; i++)
				System.out.printf("=> %s\n", list[i]);
			System.out.println();
			input();	
	    }
		System.out.println("* 종료되었습니다.");
	}
	
}
