package wa_lab.stepB;

import java.util.*;

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
		area = width*height;
		System.out.println("직사각형의 넓이는 "+area+" 이고 ");
		if(rect(width,height)==true) {
			System.out.print("정사각형 입니다. ");
		}else {
			System.out.print("정사각형이 아닙니다.");
		}
		return ;
	}
	
	public Boolean rect(int width, int height) {
		if(width==height)
			return true;
		else
			return false;
	}
}
