package wa_lab.stepD;

import java.util.*;

public class JudgeRect5 {
	int width, height; 
	int count1;
	int count2;
	int count3;
	int count4; 
	int count5;
	Scanner s = new Scanner(System.in);
	
	JudgeRect5(){
		input();
	}
	public void input() {
		while(true) {
			System.out.print("직사각형의 가로 크기와 세로 크기를 입력하시오 : ");
			width = s.nextInt();
			height = s.nextInt();
			if(width<0 || height<0)
				break;
			count(width, height);
		}
	}
	private void count(int width, int height) {
		if(width == height)
			count1++;
		else if(width >= height*2)
			count2++;
		else if(height >= width*2)
			count3++;
		else if(width > height)
			count4++;
		else if(width < height)
			count5++;
	}
	public void print_result() {
		System.out.printf("\"정사각형\"의 개수는 %d 입니다.\n", count1);
		System.out.printf("\"좌우로 길쭉한 직사각형\"의 개수는 %d 입니다.\n", count2);
		System.out.printf("\"위아래로 길쭉한 직사각형\"의 개수는 %d 입니다.\n", count3);
		System.out.printf("\"일반적인 가로형 직사각형\"의 개수는 %d 입니다.\n", count4);
		System.out.printf("\"일반적인 세로형 직사각형\"의 개수는 %d 입니다.\n", count5);
	}
}
