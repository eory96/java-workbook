package wa_lab.stepE;

import java.util.*;

public class Rect1 {
	int length;
	int i,j;
	Scanner s = new Scanner(System.in);
	Rect1(){
		input();
	}
	public void input() {
		System.out.print("정사각형의 크기를 입력하시오");
		length = s.nextInt();
	}
	public void print_result() {
		for(i=0;i<length;i++) {
			for(j=0;j<length;j++) {
				System.out.print("#");
			}
			System.out.print("\n");
		}
	}
}
