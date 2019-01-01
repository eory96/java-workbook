package wa_lab.stepI;

import java.util.*;

public class I2 {
	int height;
	int blanks;
	String ch;
	int i;
	Scanner s = new Scanner(System.in);
	
	I2(){
		input();
	}
	void input() {
		System.out.print("직각 삼각형을 그리는데 사요ㅕㅇ할 문자를 입력하시오.");
		ch = s.next();
		System.out.print("직각 삼각형의 높이와 왼쪽 여백의 크기를 입력하시오.");
		height =s.nextInt();
		blanks = s.nextInt();
		PrintCharWithBlank(ch,height,blanks);
	}
	void PrintCharWithBlank(String c,int h, int b) {
		int temp=h;
		int temp2=1;
		for(i=0;i<h;i++) {
			for(int k=b;k>=0;k--) {
				System.out.print(" ");
			}
			for(int j=temp-1;j>0;j--) {
				System.out.print(" ");
			}
			for(int j=1;j<=temp2;j++) {
				System.out.print(c);
			}
			temp--;
			temp2++; 
			System.out.print("\n");
		}
	}
}
