package wa_lab.stepE;

import java.util.*;

public class EqualTriangle3 {
	int height;
	int i,j;
	Scanner s = new Scanner(System.in);
	EqualTriangle3(){
		input();
	}
	public void input() {
		System.out.print("이등변 삼각형의 높이를 입력하시오.");
		height = s.nextInt();
	}
	public void print_result() {
		for(i=1;i<=height;i++) {
			for(j=i;j<height;j++) {
				System.out.print(" ");
			}
			for(j=0;j<2*i-1;j++) {
				System.out.print("*");
			}
			System.out.print("\n");
		}
	}
	
}
