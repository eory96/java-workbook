package wa_lab.stepC;

import java.util.Scanner;

public class CalculateRect3 {
	Scanner s = new Scanner(System.in);
	int width, height;
	int area;
	
	CalculateRect3(){
		print_result();
	}
	
	public void print_result() {
		System.out.print("직사각형의 가로 크기를 입력하시오 ");
		width = s.nextInt();
		System.out.print("직사각형의 세로 크기를 입력하시오 ");
		height= s.nextInt();
		
		if(width == height) {
			System.out.println("정사각형입니다.");
		}
		else if(width >= 2*height) {
			System.out.println("좌우로 길쭉한 직사각형 입니다.");
		}
		else if(width*2 <= height) {
			System.out.println("위아래로 길쭉한 직사각형 입니다.");
		}
		else if(width > height) {
			System.out.println("일반적인 가로형 직사각형 입니다.");
		}
		else {
			System.out.println("일반적인 세로형 직사각형 입니다.");
		}
	}
	
}
