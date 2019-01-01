package wa_lab.stepH;

import java.util.*;

public class H9 {
	String input;
	String userList[]; 
	String userInfo[]; 
	int i, j;
	Scanner s = new Scanner(System.in);
	H9(){
		input();
	}
	public void input() {
		System.out.println("===========================================");
		System.out.print("=> 문자열을 입력하세요 (x: 종료) : ");
		input = s.nextLine();
	}
	public void print_result() {
		int count = 0;
		
		while(!input.equalsIgnoreCase("X")) {

			String list[] = input.split("###");
			for(int i=0;i<list.length;i++) {
				count++;
				list[i] = list[i].replace("|"," ");
			}
			//System.out.printf("=> 총 %d번 바뀌었습니다.", count);
			//input = input.replace("|", " ");
			System.out.printf("\n=> 총 %d명이 등록되었습니다.\n", count);
			for(int k=0;k<count;k++) {
				System.out.printf("%d %s\n", k+1,list[k]);
			}
			input();
		}
		System.out.println("* 종료되었습니다.");
	}
}
